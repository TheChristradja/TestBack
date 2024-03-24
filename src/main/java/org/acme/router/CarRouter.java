package org.acme.router;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.controller.CarController;
import org.acme.dto.CarDTO;
import org.acme.model.Car;

@Path("/car")
public class CarRouter {
    private CarController carController;

    public CarRouter(CarController carController) {
        this.carController = carController;
    }

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("/{carID}")
    public Car get(@PathParam("carID") int carId){
        return carController.get(carId);
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    @Path("/{carID}/move")
    public void move(@PathParam("carID") int carId, CarDTO carDTO){
        carController.move(carId, carDTO);
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @PUT
    public void add(){
        carController.add();
    }
}
