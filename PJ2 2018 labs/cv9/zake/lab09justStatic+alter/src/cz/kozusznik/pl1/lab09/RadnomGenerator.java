/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.lab09;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
public class RadnomGenerator {
  private Random rnd = new Random();

  private int min;

  private int max;

  /**
   * @param min
   * @param max
   */
  public RadnomGenerator(int min, int max) {
    super();
    this.min = min;
    this.max = max;
  }

  public Collection<Integer> generateNumbers(int count) {
    Collection<Integer> result = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      result.add(rnd.nextInt((max + 1) - min) + min);
    }
    return result;
  }

}
