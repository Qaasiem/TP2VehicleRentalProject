package VehicleDomain.Factories;


import VehicleDomain.Domain.Booking;

import javax.crypto.KeyGenerator;
import java.util.Map;

/**
 * Created by L.z Double E on 11/3/2017.
 */
public class BookingFactory {
    public static Booking buildBooking(Map<String, String> values, int duration, boolean availabilityFK
    {
        Booking booking = new Booking.Builder()
                .id(KeyGenerator.getEntityId())
                .pickupDate(values.get("pickupDate"))
                .returnDate(values.get("returnDate"))
                .duration(duration)
                .availability(availabilityFK)
                .build();
        return booking;
    }
}
