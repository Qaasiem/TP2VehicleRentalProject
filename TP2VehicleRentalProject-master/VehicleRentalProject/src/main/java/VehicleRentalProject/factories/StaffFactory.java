package VehicleRentalProject.factories;

import VehicleRentalProject.domain.Staff;

public class StaffFactory 
{
    public static Staff getStaff(String employeeID, String employeeFirstName, String employeeLastname,
                               String email, String userName, String password, String role) {


        Staff staff = new Staff.Builder()

                .employeeID(employeeID)
                .employeeFirstName(employeeFirstName)
                .employeeLastName(employeeLastname)
                .email(email)
                .userName(userName)
                .password(password)
                .role(role)
                .build();

        return staff;
    }
}
