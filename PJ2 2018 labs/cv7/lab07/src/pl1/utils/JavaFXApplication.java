/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.utils;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class JavaFXApplication extends Application {
  private static Stage primaryStage;

  public static Stage getPrimaryStage() {
    if (primaryStage == null) {
      launchAsync();
    }
    return primaryStage;
  }

  @Override
  public void start(Stage primaryStage) {
    synchronized (JavaFXApplication.class) {
      JavaFXApplication.primaryStage = primaryStage;
//      Region root = createRoot();
//      Scene scene = new Scene(root, root.getPrefWidth(), root.getPrefHeight());
//      primaryStage.setTitle("Hello World!");
//      primaryStage.setScene(scene);
//      primaryStage.show();
//      constructed = true;
      JavaFXApplication.class.notifyAll();

    }
  }

  protected Object getActualClass() {
    return this.getClass();
  }

  public static void launchAsync(String... args) {
    new Thread(() -> launch(JavaFXApplication.class, args)).start();
    synchronized (JavaFXApplication.class) {
      while (primaryStage == null) {
        try {
          JavaFXApplication.class.wait();
        } catch (InterruptedException e) {
          //ignore
          return;
        }
      }
    }
  }

}
