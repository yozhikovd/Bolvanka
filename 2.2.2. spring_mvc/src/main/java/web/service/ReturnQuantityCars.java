package web.service;

import org.springframework.stereotype.Service;
import web.classes.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class ReturnQuantityCars {

    private final List<Car> carList = Arrays.asList(
            new Car("Audi", "A5", 2015),
            new Car("BMW", "M5", 2008),
            new Car("Mercedes", "e40", 2001),
            new Car("Toyota", "LC300", 2021),
            new Car("VAZ", "2100", 2015)
    );

    public List<Car> returnCars(int quantityCars) {

        if (quantityCars > carList.size()) {
            return carList.subList(0, carList.size());
        }
        return carList.subList(0, quantityCars);
    }
}
