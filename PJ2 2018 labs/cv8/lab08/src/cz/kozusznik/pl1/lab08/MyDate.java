/*******************************************************************************
 * Jan Kožusznik
 * Copyright (c) 2016 All Right Reserved, http://www.kozusznik.cz
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 ******************************************************************************/
package cz.kozusznik.pl1.lab08;

/**
 * @author Jan Kožusznik
 * @version 0.1
 */
@SuppressWarnings("unused")

public final class MyDate {

  private final int year;

  private final int month;
  private final int day;

  /**
   * @param year
   * @param month
   * @param day
   */
  public MyDate(int year, int month, int day) {
    super();
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof MyDate){
      MyDate other=(MyDate) obj;
      return this.day==other.day &&this.month==other.month && this.year==other.year;
    }
    return false;
  }
}
