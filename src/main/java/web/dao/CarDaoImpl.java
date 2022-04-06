package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao{

    private static final List <Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("Packard Cabriolet", "Lily", 1907));
        cars.add(new Car("Bugatti", "Atlantic", 1930));
        cars.add(new Car("Wiesmann", "MA", 1902));
        cars.add(new Car("BUICK", "D04", 1918));
        cars.add(new Car("CHRYSLER ", "DESOTO AIRFLOW", 1922));
    }

    @Override
    public List<Car> getCars() {
        List <Car> cars1 = new ArrayList<>(cars);
        return cars1;
    }

    @Override
    public List<Car> getCount(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
