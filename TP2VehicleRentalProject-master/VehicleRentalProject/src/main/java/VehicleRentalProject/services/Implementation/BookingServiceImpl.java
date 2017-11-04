package VehicleDomain.Services.Implementation;


import VehicleDomain.Domain.Booking;
import VehicleDomain.Repositories.BookingRepository;
import VehicleDomain.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by L.z Double E on 11/3/2017.
 */
@Component
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public Booking save(Booking booking)
    {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking findByID(String id)
    {
        return bookingRepository.findOne(id);
    }

    @Override
    public Booking update(String id)
    {
        return null;
    }
}
