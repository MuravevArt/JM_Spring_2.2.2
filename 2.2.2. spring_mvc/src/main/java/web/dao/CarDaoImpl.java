package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "X5", 2010));
        cars.add(new Car("Mercedes-Benz", "G-63", 2018));
        cars.add(new Car("Opel", "Astra", 2003));
        cars.add(new Car("Toyota", "Prius", 2013));
        cars.add(new Car("Audi", "Q8", 2021));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return count != null && count < 5 ? cars.subList(0, count) : cars;
    }
}
