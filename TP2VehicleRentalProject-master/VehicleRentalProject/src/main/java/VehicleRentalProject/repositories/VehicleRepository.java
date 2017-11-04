package VehicleDomain.Repositories;

import VehicleDomain.Domain.Booking;
import VehicleDomain.Domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Zany on 11/4/2017.
 */
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
        Iterable<Vehicle> findAllById(Booking booking);
        Vehicle findCarsById(Long vehicleID);
}
