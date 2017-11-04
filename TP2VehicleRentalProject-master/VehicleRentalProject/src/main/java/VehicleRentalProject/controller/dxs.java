package VehicleDomain.Controller;

import VehicleDomain.Domain.Vehicle;
import VehicleDomain.Services.Implementation.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zany on 11/4/2017.
 */
@Controller
@RequestMapping(path = "/Vehicle")
public class VehicleController {

    private Vehicle vehicle;
    private Category category;

    @Autowired
    private VehicleServiceImpl vehicleService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @CrossOrigin
    @PostMapping(path = "/{categoryId}/addVehicle")
    public @ResponseBody
    Vehicle create(@PathVariable long categoryId,
               @RequestParam String make, @RequestParam String model,
               @RequestParam int year, @RequestParam String numberPlate,
               @RequestParam boolean status)
    {
        Map<String, String> stringValues = new HashMap<String, String>();
        stringValues.put("make", vehicleMake);
        stringValues.put("model", model);
        stringValues.put("numberPlate", numberPlate);

        category = categoryService.read(categoryId);

        car = CarFactory.getCar(category, stringValues, year, status);

        return carService.create(car);
    }
    @CrossOrigin
    @GetMapping(path = "/readCar")
    public @ResponseBody Car read(@RequestParam long id)
    {
        return carService.read(id);
    }

    @CrossOrigin
    //function to edit the car according to the transaction
    @PostMapping(path = "/{categoryId}/updateCar")
    public @ResponseBody Car update(@PathVariable long categoryId, @RequestParam long id, @RequestParam String make, @RequestParam String model,
                                    @RequestParam int year, @RequestParam String numberPlate,
                                    @RequestParam boolean status)
    {

        //category = categoryService.read(categoryId);
        category = categoryService.read(categoryId);
        Car carUpdate = new Car.Builder()
                .id(id)
                .make(make)
                .model(model)
                .year(year)
                .numberPlate(numberPlate)
                .status(status)
                .category(category)
                .build();

        return carService.update(carUpdate);
    }

    @CrossOrigin
    @GetMapping (path = "/deleteCar")
    public @ResponseBody void delete(@RequestParam long id)
    {
        carService.delete(id);
    }

    @CrossOrigin
    //function to read all cars in the database and print to table
    @GetMapping(path = "/readAllCars")
    public @ResponseBody Iterable<Car> getAllCar()
    {
        return carService.readAll();
    }

}
