package VehicleDomain.Factories;

import VehicleDomain.Domain.Booking;
import VehicleDomain.Domain.Vehicle;

import java.util.Map;

/**
 * Created by Zany on 11/4/2017.
 */
 public class VehicleFactory {
        public static Vehicle getVehicle(Booking booking, Map<String, String> stringValues, int duration, boolean availability)
        {
            Vehicle vehicle = new Vehicle.Builder()
                    .vehicleMake(stringValues.get("Vehicle make"))
                    .vehicleModel(stringValues.get("Vehicle model"))
                    .vehicleRegNum(stringValues.get("Registration Number"))
                    .availability(availability)
                    .booking(booking)
                    .build();
            return vehicle;
        }
 }

