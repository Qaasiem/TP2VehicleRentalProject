package VehicleDomain.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Zany on 11/4/2017.
 */
@Entity
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long vehicleID;
    private String vehicleRegNum;
    private String vehicleMake;
    private String vehicleModel;
    private boolean availability;

    @ManyToOne
    private Booking booking;

    private Vehicle(){
    }

    public Vehicle(Builder builder) {
        this.vehicleID = builder.vehicleID;
        this.vehicleRegNum = builder.vehicleRegNum;
        this.vehicleMake = builder.vehicleMake;
        this.vehicleModel = builder.vehicleModel;
        this.availability = builder.availability;
        this.booking = builder.booking;
    }

    public static class Builder{
        private long vehicleID;
        private String vehicleRegNum;
        private String vehicleMake;
        private String vehicleModel;
        private boolean availability;
        private Booking booking;


        public Builder vehicleID(long value)
        {
            this.vehicleID = value;
            return this;
        }
        public Builder vehicleRegNum(String value)
        {
            this.vehicleRegNum = value;
            return this;
        }
        public Builder vehicleMake(String value)
        {
            this.vehicleMake = value;
            return this;
        }
        public Builder vehicleModel(String value)
        {
            this.vehicleModel = value;
            return this;
        }
        public Builder availability(boolean value)
        {
            this.availability = value;
            return this;
        }

        public Builder booking(Booking value)
        {
            this.booking = value;
            return this;
        }

        public Vehicle build()
        {
            return new Vehicle(this);
        }


    }

    public long getVehicleID() {
        return vehicleID;
    }

    public String getVehicleRegNum() {
        return getVehicleRegNum();
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public boolean isAvailable() {
        return availability;
    }

    public Booking getBooking() {
        return booking;
    }

    @Override
    public boolean equals(Object v) {
        if (this == v) return true;
        if (v == null || getClass() != v.getClass()) return false;

        Vehicle vehicle = (Vehicle) v;

        return vehicleID == vehicle.vehicleID;
    }

    @Override
    public int hashCode() {
        return (int) (vehicleID ^ (vehicleID >>> 32));
    }
}
