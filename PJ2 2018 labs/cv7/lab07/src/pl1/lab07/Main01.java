/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.lab07;

import pl1.shapes.manager.CanvasManager;
import pl1.shapes.manager.Ellipse;
import pl1.shapes.manager.Rectangle;
import pl1.shapes.manager.Triangle;

import java.util.ArrayList;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Main01 {

  public static void main(String[] args) {
    CanvasManager.getInstance();
    ArrayList<IValuable> items= new ArrayList<>();
    items.add(new Rectangle());
    items.add(new Ellipse());
    items.add(new Triangle());
    AverageComputer computer =new AverageComputer();
    double average =computer.getAverageOfItems(items);
    System.out.println(average);

  }

}
