package cz.kozusznik.pl1.lab09;

import cz.kozusznik.pl1.shapes.tools.IMovable;

import java.util.Comparator;

public class ImovableComparator implements Comparator<IMovable> {
  @Override
  public int compare (IMovable o1, IMovable o2) {
    if (o1.getX() == o2.getX() && o1.getY() == o2.getY()) {
      return 0;
    } else if (o1.getX() < o2.getX() && o1.getY() < o2.getY()) {
      return -1;
    } else {
      return 1;
    }
  }
}
