package cars;

public class Car {

    //Variable declarations
    private String brand;
    private int horsepower;
    private int price;
    private int yearOfManufacture;

    //Constructor declarations to set initial values for cars attributes
    public Car(String brand, int horsepower, int price, int yearOfManufacture) {
        this.brand = brand;
        this.horsepower = horsepower;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    //Setter and getter methods for retrieving and updating value of variables
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    //toString method to return the String representation of the object
    @Override
    public String toString() {
        return "Car{" + "Brand: " + brand + ", Horsepower: " + horsepower + ", Price: " + price + ", Year of Manufacture: " + yearOfManufacture + '}';
    }

}
