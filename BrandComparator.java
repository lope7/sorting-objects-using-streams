package cars;

import java.util.Comparator;

public class BrandComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getBrand().compareTo(o2.getBrand()) > 0) {
            return 1;
        } else if (o1.getBrand().compareTo(o2.getBrand()) < 0) {
            return -1;
        } else {
            return 0;
        }

    }

}
