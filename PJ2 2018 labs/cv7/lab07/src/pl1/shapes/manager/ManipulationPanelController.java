/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.shapes.manager;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pl1.shapes.Direction8;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class ManipulationPanelController {

  private static final String RECTANGLE = "Obdelník";

  private static final String TRIANGLE = "Trojúhelník";

  private static final String ELLIPSE = "Elipsa";

  private static final String PACMAN = "Pacman";

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
      }
      else  if (deleteRB.isSelected()){
        deleteShape(e.getX(), e.getY());
      }
    }
  }

  private void deleteShape(double x, double y) {
    CanvasManager.getInstance().delete(x, y);
  }

  public void mouseMoved(MouseEvent e) {
    actualX.setText(e.getX() + "");
    actualY.setText(e.getY() + "");
  }

  private void moveShape(double x, double y) {
    //TODO
      Object tmp=toCreate.getValue();
      moveTo(tmp, x, y);
    //pokud není vybrán žádný tvar:
    //   vybrat
    //jinak:
    // posunout daný tvar na specifickout pozici - zavolat metodu moveTo
    //moveTo(vybrany tvar, x, y);

  }

  private void doMoving(Object obj, double x, double y) {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

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
            .add(new Rectangle((int) x, (int) y, 50, 50));
        break;
      case ELLIPSE:
        CanvasManager.getInstance()
                .add(new Ellipse((int) x, (int) y, 50, 50));
        break;
      case TRIANGLE:
        CanvasManager.getInstance()
                .add(new Triangle((int) x, (int) y, 50, 50));
        break;
      /*case PACMAN:
        CanvasManager.getInstance()
                .add(new Pacman((int)x, (int)y, Direction8.WEST, 50, 50));
*/

    }
  }

}
