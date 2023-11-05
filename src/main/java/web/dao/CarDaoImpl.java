package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    private static int CARS_COUNT = 0;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(++CARS_COUNT, "BMW", "YEllow"));
        carsList.add(new Car(++CARS_COUNT, "Volkswagen", "Silver"));
        carsList.add(new Car(++CARS_COUNT, "Honda", "Brown"));
        carsList.add(new Car(++CARS_COUNT, "Audi", "White"));
        carsList.add(new Car(++CARS_COUNT, "Honda", "Silver"));
    }

    public List<Car> getCarList() {
        return carsList;
    }
}
