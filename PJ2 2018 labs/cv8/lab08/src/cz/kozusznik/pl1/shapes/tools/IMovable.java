/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.shapes.tools;

import cz.kozusznik.pl1.shapes.Position;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public interface IMovable {
  Position getPosition();

  int getX();

  int getY();

  void setPosition(int x, int y);

}
