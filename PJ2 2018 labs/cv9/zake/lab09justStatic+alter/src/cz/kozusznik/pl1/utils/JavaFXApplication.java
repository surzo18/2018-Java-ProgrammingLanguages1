/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.utils;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public abstract class JavaFXApplication extends Application {
  protected static boolean constructed;

  @Override
  public void start(Stage primaryStage) {
    synchronized (getActualClass()) {
      Region root = createRoot();
      Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
      primaryStage.setTitle("Hello World!");
      primaryStage.setScene(scene);
      primaryStage.show();
      constructed = true;
      getActualClass().notifyAll();

    }
  }

  protected Object getActualClass() {
    return this.getClass();
  }

  protected abstract Region createRoot();

  public static void launchAsync(Class<? extends Application> appClass,
      String... args) {
    new Thread(() -> launch(appClass, args)).start();
    synchronized (appClass) {
      while (!constructed) {
        try {
          appClass.wait();
        } catch (InterruptedException e) {
          //ignore
          return;
        }
      }
    }
  }

}
