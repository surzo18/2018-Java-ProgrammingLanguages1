/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

import java.util.Scanner;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Main {
  public static void main(String[] args) throws InterruptedException {
    House h=new House();
    for (int i=0; i<10; ++i){
      h.moveRight(10);
      Thread.sleep(1000);
    }
    Scanner scanner=new Scanner(System.in);
    int x=scanner.nextInt();
    int y=scanner.nextInt();

    System.out.println(x);
    System.out.println(x);



    Canvas.getInstance();
//
//    int x=IO.enter("Enter x value:", 20);
//    int y=IO.enter("Enter y value:", 20);
//    Pacman pac = new Pacman(x, y, Direction8.NONE);
//    pac.paint();
//    for (int i = 0; i < 10; i++) {
//      pac.moveRight(10);
//      Thread.sleep(1000);

    //}
  }
}
