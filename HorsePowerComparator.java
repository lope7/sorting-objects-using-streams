package cars;

import java.util.Comparator;

public class HorsePowerComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getHorsepower() > o2.getHorsepower()) {
            return -1;
        } else if (o1.getHorsepower() < o2.getHorsepower()) {
            return 1;
        } else {
            return 0;
        }
    }
}
