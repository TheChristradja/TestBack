package org.acme.model;

import lombok.Data;

@Data
public class Car{
    private int x;
    private int y;
    private float fuel;
    private float direction;



    public void forward(int n) {
        // Calculate the change in x and y coordinates based on the direction and distance
        double radians = Math.toRadians(direction);
        int dx = (int) (Math.cos(radians) * n);
        int dy = (int) (Math.sin(radians) * n);

        // Update the position of the car
        x += dx;
        y += dy;

        // Consume fuel based on distance traveled
        float fuelConsumed = calculateFuelConsumption(n);
        fuel -= fuelConsumed;
    }

    public void backward(int n) {
        // Calculate the change in x and y coordinates based on the opposite direction and distance
        double radians = Math.toRadians(direction);
        int dx = (int) (-Math.cos(radians) * n);
        int dy = (int) (-Math.sin(radians) * n);

        // Update the position of the car
        x += dx;
        y += dy;

        // Consume fuel based on distance traveled
        float fuelConsumed = calculateFuelConsumption(n);
        fuel -= fuelConsumed;
    }

    private float calculateFuelConsumption(int distance) {
        // Assuming a constant fuel consumption rate per unit distance
        // Adjust this calculation according to your specific requirements
        return distance * 0.1f; // Example: 0.1f fuel consumed per unit distance
    }

    public void left(){
        setDirection(getDirection()-10);
    }

    public void right(){
        setDirection(getDirection()+10);
    }



}
