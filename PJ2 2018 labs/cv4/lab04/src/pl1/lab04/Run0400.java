/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package pl1.lab04;

import pl1.canvas.Canvas;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Run0400 {
  public static void main(String[] args) {
    Canvas.getInstance();


  String x="hello";
  String y= new String(new char[]{'h','e','l','l','o'}) ;
  String z= new String("hello");

  System.out.println(x==y);
  System.out.println(x.equals(y));


  Date d1= new Date(9,10,2020);
  Date d2= new Date( 9,10,2020);


  System.out.println(d1==d2);

  System.out.println(d1.equals(d2));
  System.out.println(d1.compareTo(d2));
  }
}
//todo hw pacman new pacman()
//p.animate p1, p2, p3 int neco , int milis )
//edvard kubanda

/*

for ( i = 0; i < 60; i ++ )
        {
        int x1 = xc + r * cos ( i * M_PI / 30 );
        int y1 = yc + r * sin ( i * M_PI / 30 );
        int rr = i % 5 == 0 ? 0.85 * r : 0.92 * r;
        int x2 = xc + rr * cos ( i * M_PI / 30 );
        int y2 = yc + rr * sin ( i * M_PI / 30 ); */

/*  static void        drawHand  ( SDL_Renderer* dst,int xc, int yc, int r, int v )
  {
    int x = xc + r * cos ( ( 15 - v ) * M_PI / 30 );
    int y = yc - r * sin ( ( 15 - v ) * M_PI / 30 );

    SDL_RenderDrawLine ( dst, xc, yc, x, y );
  }
*/