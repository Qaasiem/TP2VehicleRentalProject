package VehicleDomain.Services;

import VehicleDomain.Domain.Booking;
import VehicleDomain.Domain.Vehicle;

/**
 * Created by Zany on 11/4/2017.
 */
public interface VehicleService {
    Vehicle create(Vehicle vehicle);
    Vehicle read(long vehicleID);
    Vehicle update(Vehicle vehicle);
    void delete(long vehicleID);

    //function to read all cars in the database and print to table
    Iterable<Vehicle> readAll();

    //function to read all cars based on the category
    Iterable<Vehicle> findAllById(Booking booking);
}
