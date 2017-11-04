package VehicleDomain.Repositories;


import VehicleDomain.Domain.Booking;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public interface BookingRepository extends CrudRepository<Booking, String> {
}
