package VehicleRentalProject.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Staff 
{
    //@Id
    //@Expose
    @GeneratedValue
    private String employeeID;

    //@Expose
    private String employeeFirstName;
    //@Expose
    private String employeeLastName;
    //@Expose
    private String email;
    //@Expose
    private String userName;
    //@Expose
    private String password;
    //@Expose
    private String role;

    public static class Builder
    {
        private String employeeID;
        private String employeeFirstName;
        private String employeeLastName;
        private String email;
        private String userName;
        private String password;
        private String role;

        public Builder employeeID(String value){
            this.employeeID = value;
            return this;
        }

        public Builder employeeFirstName(String value){
            this.employeeFirstName = value;
            return this;
        }

        public Builder employeeLastName(String value){
            this.employeeLastName = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder userName(String value){
            this.userName = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder role(String value){
            this.role = value;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }

    private Staff(){}

    public Staff(Builder builder) 
    {
        this.employeeID = builder.employeeID;
        this.employeeFirstName = builder.employeeFirstName;
        this.employeeLastName = builder.employeeLastName;
        this.email = builder.email;
        this.userName = builder.userName;
        this.password = builder.password;
        this.role = builder.role;
        this.email = builder.email;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        return employeeID.equals(staff.employeeID);
    }

    @Override
    public int hashCode() {
        return employeeID.hashCode();
    }

    @Override
    public String toString() {



        return "Staff{" +
                "Employee ID ='" + employeeID + '\'' +
                ", First Name ='" + employeeFirstName + '\'' +
                ", Last Name ='" + employeeLastName + '\'' +
                ", Email ='" + email + '\'' +
                ", User Name ='" + userName + '\'' +
                ", Password ='" + password + '\'' +
                ", Role =" + role +
                '}';
    }
}
