/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.lab09;

import cz.kozusznik.pl1.shapes.manager.IPaintable;
import cz.kozusznik.pl1.shapes.manager.MyGraphics;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Cell<T> implements IPaintable {

  private T val;

  /**
   * @return the val
   */
  public T getVal() {
    return val;
  }

  /**
   * @param val
   *          the val to set
   */
  public void setVal(T val) {
    this.val = val;
  }

  @Override
  public void paint(MyGraphics graphics) {
    //val.paint(graphics);
  }

}
