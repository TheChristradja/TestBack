package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;
import lombok.Data;
import org.acme.model.Car;

import java.util.ArrayList;

@Data
@ApplicationScoped
public class Game {
    private ArrayList<Car> cars = new ArrayList<>();

    public void add(Car car){
        this.cars.add(car);
    }

    public void remove(Car car){
        cars.remove(car);
    }

    public Car getById(int id){
        return cars.get(id);
    }


}
