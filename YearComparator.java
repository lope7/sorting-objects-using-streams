package cars;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getYearOfManufacture() > o2.getYearOfManufacture()) {
            return 1;
        } else if (o1.getYearOfManufacture() < o2.getYearOfManufacture()) {
            return -1;
        } else {
            return 0;
        }

    }
}
    
    

