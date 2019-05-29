/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.shapes.manager;

import java.util.ArrayList;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class ManipulationPanelController {

  private static final String RECTANGLE = "Obdelník";

  private static final String TRIANGLE = "Trojúhelník";

  private static final String ELLIPSE = "Elipsa";

  private ArrayList<IPaintable> createdObjects = new ArrayList<>();
  @FXML
  private ComboBox<String> toCreate;

  @FXML
  private RadioButton createRB;

  @FXML
  private RadioButton moveRB;

  @FXML
  private RadioButton modifyRB;

  @FXML
  private RadioButton deleteRB;

  @FXML
  private TextField actualX;

  @FXML
  private TextField actualY;

  @FXML
  private TextField selectedX;

  @FXML
  private TextField selectedY;

  @FXML
  private Node controlPanel;

  /**
   *
   */
  public ManipulationPanelController() {
    Platform.runLater(() -> {
      toCreate.setItems(
          FXCollections.observableArrayList(RECTANGLE, TRIANGLE, ELLIPSE));
      toCreate.setValue(RECTANGLE);
    });
  }

  public void mousePressed(MouseEvent e) {

    if (e.isPrimaryButtonDown()) {
      selectedX.setText(e.getX() + "");
      selectedY.setText(e.getY() + "");
      if (createRB.isSelected()) {
        createShape(e.getX(), e.getY(), toCreate.getValue());
      } else if (moveRB.isSelected()) {
        moveShape(e.getX(), e.getY());
      } else if (deleteRB.isSelected()) {
        for (IPaintable i : createdObjects) {
          if (i instanceof IClickable) {
            IClickable cl = (IClickable) i;
            if (cl.isInBound(e.getX(), e.getY())) {
              createdObjects.remove(i);
              CanvasManager.getInstance().remove(i);
              break;
            }
          }
        }
      }
    }
  }

  public void mouseMoved(MouseEvent e) {
    actualX.setText(e.getX() + "");
    actualY.setText(e.getY() + "");
  }

  private void moveShape(double x, double y) {
    //TODO
    //pokud není vybrán žádný tvar:
    //   vybrat
    //jinak:
    // posunout daný tvar na specifickout pozici - zavolat metodu moveTo
    moveTo(null, x, y);
  }

  private void doMoving(Object obj, double x, double y) {
    //TODO zde bude kod pro volání objektu, který zajistí animaci
  };

  private void moveTo(Object obj, double x, double y) {
    new Thread() {
      @Override
      public void run() {
        controlPanel.setDisable(true);
        doMoving(obj, x, y);
        controlPanel.setDisable(false);
      }

    }.start();
  }

  private void createShape(double x, double y, String value) {
    switch (value) {
      case RECTANGLE:
        CanvasManager.getInstance()
            .add(add(new Rectangle((int) x, (int) y, 50, 50)));
        break;
      case ELLIPSE:
        CanvasManager.getInstance()
            .add(add(new Ellipse((int) x, (int) y, 50, 50)));
        break;
    }
  }

  private IPaintable add(IPaintable rectangle2) {
    createdObjects.add(rectangle2);
    return rectangle2;
  }

}
