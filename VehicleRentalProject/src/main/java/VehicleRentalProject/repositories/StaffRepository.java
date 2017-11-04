package VehicleRentalProject.repositories;

import VehicleRentalProject.domain.Staff;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, String>
{
    List<Staff> findByusername(String userName);
    List<Staff> findById(Long id);
    List<Staff> findBypassword(String password);
}
