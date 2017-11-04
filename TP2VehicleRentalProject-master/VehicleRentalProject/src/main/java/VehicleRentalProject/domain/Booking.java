package VehicleDomain.Domain;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * Created by L.z Double E on 11/2/2017.
 */
@Entity
public class Booking implements Serializable{

    @Id
    private String id;
    private String pickupDate;
    private String returnDate;
    private int duration;
    private boolean availabilityFK;



    public String getId() {
        return id;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isAvailabityFK() {
        return  availabilityFK;
    }

    private Booking(){}

    public Booking(Builder builder)
    {
        this.id = builder.id;
        this.pickupDate = builder.pickupDate;
        this.returnDate = builder.returnDate;
        this.duration = builder.duration;
        this.availabilityFK = builder.availabilityFK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;

        Booking booking = (Booking) o;

        return getId().equals(booking.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", pickupDate=" + pickupDate +
                ", returnDate=" + returnDate +
                ", duration=" + duration +
                ", availabilityFK=" + availabilityFK +
                '}';
    }

    public static class Builder {
        private String id;
        private String pickupDate;
        private String returnDate;
        private int duration;
        private boolean availabilityFK;


        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder pickupDate(String value) {
            this.pickupDate = value;
            return this;
        }

        public Builder returnDate(String value) {
            this.returnDate = value;
            return this;
        }

        public Builder duration(int value) {
            this.duration = value;
            return this;
        }

        public Builder availabilityFK(boolean value) {
            this.availabilityFK = value;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

    }



}
