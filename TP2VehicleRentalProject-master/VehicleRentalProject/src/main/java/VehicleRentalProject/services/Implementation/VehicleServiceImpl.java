package VehicleDomain.Services.Implementation;

import VehicleDomain.Domain.Booking;
import VehicleDomain.Domain.Vehicle;
import VehicleDomain.Repositories.VehicleRepository;
import VehicleDomain.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Zany on 11/4/2017.
 */
@Component
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle create(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle read(long vehicleID) {
        return vehicleRepository.findOne(vehicleID);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void delete(long vehicleID) {
        vehicleRepository.delete(vehicleID);
    }

    //function to read all cars in the database and print to table
    @Override
    public Iterable<Vehicle> readAll() {
        return vehicleRepository.findAll();
    }


    //function to read all cars based on the category
    @Override
    public Iterable<Vehicle> findAllById(Booking booking) {

        return vehicleRepository.findAllById(booking);
    }
}
