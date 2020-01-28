package cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarsList {

    //list declaration
    private List<Car> list;

    //Setter and getter methods
    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    //New cars  empty list (ArrayList) declaration
    public CarsList() {

        this.list = new ArrayList();

    }

    public CarsList(List<Car> mainlist) {
        this.list = mainlist;
    }

    //Method to add cars into the list
    public boolean add(Car newcar) {
        return list.add(newcar);

    }

    //Method to show a list using streams
    public void showList() {
        list.stream().forEach(System.out::println);

    }

    //Method to sort variables depending on the comparator using streams
    public CarsList sort(Comparator<Car> comparador) {

        return new CarsList(list.stream().sorted(comparador).collect(Collectors.toList()));
    }

}
