/*******************************************************************************
 * Kožusznik Jan
 * Copyright (c) 2014 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/

package $012_networking;

import java.io.Serializable;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class Prepravka implements Serializable {
  /**
   *
   */
  private static final long serialVersionUID = 2427329186028578856L;
  private final int number;
  private final String message;

  /**
   * @param number
   * @param message
   */
  public Prepravka(int number, String message) {
    super();
    this.number = number;
    this.message = message;
  }

  @Override
  public String toString() {
    return "Prepravka [number=" + number + ", message=" + message + "]";
  }

}
