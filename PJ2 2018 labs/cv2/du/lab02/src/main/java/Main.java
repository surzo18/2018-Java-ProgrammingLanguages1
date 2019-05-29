/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/


import javafx.scene.canvas.Canvas;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Main {
  public static void main(String[] args) throws InterruptedException {
   /* House h=new House();
    for (int i=0; i<10; ++i){
      h.moveRight(10);
      Thread.sleep(1000);
    }*/
//    Scanner scanner=new Scanner(System.in);
//    int x=scanner.nextInt();
//    int y=scanner.nextInt();
//
//    System.out.println(x);
//    System.out.println(x);
//
//
//
//    Canvas.getInstance();

//    int x = IO.enter("Enter x value:", 20);
//    int y = IO.enter("Enter y value:", 20);


    int x=20;
    int y=20;
    Pacman pac = new Pacman(x, y, Direction8.WEST);
    //Canvas can= new Canvas();
    /*while (true) {
      if (can.getSmer()){}
      else if (can.getSmer()==1){
        pac.moveRight(5);
      }
      else if (can.getSmer()==2){
        pac.moveDown(5);
      }
      else if (can.getSmer()==3){
        pac.moveRight(-5);
      }
      else if (can.getSmer()==4){
        pac.moveDown(-5);
      }
      else {}
      Thread.sleep(100);
    }*/
    for (int i = 0; i < 1000; i++) {
      for (int j = 0; j < 200; j++) {
        pac.moveRight(1);
        Thread.sleep(20);
      }
      for (int j = 0; j < 200; j++) {
        pac.moveDown(1);
        Thread.sleep(20);
      }
      for (int j = 0; j < 200; j++) {
        pac.moveRight(-1);
        Thread.sleep(20);
      }
      for (int j = 0; j < 200; j++) {
        pac.moveDown(-1);
        Thread.sleep(20);
      }
    }

    Thread.sleep(2000);

    pac.moveRight(50);
    Thread.sleep(2000);

    pac.moveDown(50);
    Thread.sleep(2000);

    pac.moveRight(-50);
    Thread.sleep(2000);


    pac.moveDown(-50);
    Thread.sleep(2000);


//    for (int i = 0; i < 10; i++) {
//      pac.moveRight(10);
//      Thread.sleep(1000);


   // }
  }
}
