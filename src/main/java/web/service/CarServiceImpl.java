package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService{

    CarDaoImpl carDao = new CarDaoImpl();
    @Override
    public List<Car> getCarList(Integer count) {
        if (count == null) {
            return carDao.getCarList();
        } else {
            return carDao.getCarList().stream().limit(count).toList();
        }
    }
}
