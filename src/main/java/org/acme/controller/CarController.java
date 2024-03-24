package org.acme.controller;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.Game;
import org.acme.dto.CarDTO;
import org.acme.model.Car;

import java.util.Random;

@ApplicationScoped
public class CarController {
    private Game game;

    public CarController(Game game) {
        this.game = game;
    }

    public Car get(int carId) {
        return game.getById(carId);
    }

    public void move(int carId, CarDTO carDTO) {
        Car car = this.get(carId);
        switch (carDTO.getInstruction()){
            case LEFT -> car.left();
            case RIGHT -> car.right();
            case FORWARD -> car.forward(10);
            case BACKWARD -> car.backward(10);
        }
    }

    public void add(){
        Car car = new Car();
        Random random = new Random();
        car.setDirection(random.nextFloat());
        car.setX(random.nextInt());
        car.setY(random.nextInt());
        game.add(car);
    }
}
