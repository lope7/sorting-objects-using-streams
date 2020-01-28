package cars;

public class MainClass {

    public static void main(String[] args) {

        Car car1  = new Car("BMW",300,80500,2020);
        Car car2  = new Car("AUDI",250,70900,2018);
        Car car3  = new Car("FORD",90,31000,2016);
        Car car4  = new Car("HYUNDAI",120,25000,2017);
        Car car5  = new Car("LEXUS",250,70200,2015);
        Car car6  = new Car("MAZDA",85,25500,2019);
        Car car7  = new Car("SEAT",85,35000,2014);
        Car car8  = new Car("RENAULT",70,32500,2018);
        Car car9  = new Car("SKODA",55,20100,2016);
        Car car10 = new Car("TOYOTA",150,50500,2019);
        Car car11 = new Car("VOLVO",200,35500,2017);
        Car car12 = new Car("VOLKSWAGEN",180,36500,2014);

        CarsList mainlist = new CarsList();

        mainlist.add(car1);
        mainlist.add(car2);
        mainlist.add(car3);
        mainlist.add(car4);
        mainlist.add(car5);
        mainlist.add(car6);
        mainlist.add(car7);
        mainlist.add(car8);
        mainlist.add(car9);
        mainlist.add(car10);
        mainlist.add(car11);
        mainlist.add(car12);

        System.out.println("List of all cars");

        mainlist.showList();

        System.out.println("Cars sorted alphabetically by brand");

        mainlist.sort(new BrandComparator()).showList();

        System.out.println("Cars sorted by higher prices");

        mainlist.sort(new PriceComparator()).showList();

        System.out.println("Cars sorted by age of manufacture");

        mainlist.sort(new YearComparator()).showList();

        System.out.println("Cars sorted by power");

        mainlist.sort(new HorsePowerComparator()).showList();

    }

}
