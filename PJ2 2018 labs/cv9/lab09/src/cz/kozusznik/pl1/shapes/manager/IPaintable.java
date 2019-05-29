/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.shapes.manager;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public interface IPaintable {
  /***************************************************************************
   * Za pomoci dodaného kreslítka vykreslí obraz své instance
   * na animační plátno.
   * 
   * @param graphics
   *          Kreslítko, kterým se instance nakreslí na plátno.
   */
  void paint(MyGraphics graphics);
}
