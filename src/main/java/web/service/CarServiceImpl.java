package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    List <Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Subaru","Impreza",123654));
        cars.add(new Car("Mercedes","S-class",142345));
        cars.add(new Car("BMW","325i",143234));
        cars.add(new Car("Lada","Vesta",452712));
        cars.add(new Car("Toyota","Camry",234789));
    }
    @Override
    public List<Car> getCountCars(int counter) {
        List<Car> result = new ArrayList<>();

        if (counter <= 0) {
            return result;
        }

        int size = cars.size();
        int count = Math.min(counter, size);

        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }

        System.out.println(result.toString());
        return result;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}



