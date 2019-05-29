package pl1.lab07;

import java.util.ArrayList;

public class AverageComputer {
    public double getAverageOfItems(ArrayList<IValuable> items){
        double sum =0;
        for (IValuable item: items){
            sum+=item.getValue();
        }
        return sum/items.size();
    }
}
