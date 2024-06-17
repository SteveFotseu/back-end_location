package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.House;
import service.HouseService;


@RestController
@RequestMapping("/api/houses")
public class HouseController {
	
	 @Autowired
	    private HouseService houseService;

	    @GetMapping
	    public List<House> getAllHouses() {
	        return houseService.getAllHouses();
	    }

	    @GetMapping("/{id}")
	    public House getHouseById(@PathVariable Long id) {
	        return houseService.getHouseById(id);
	    }

	    @PostMapping
	    public House createHouse(@RequestBody House house) {
	        return houseService.saveHouse(house);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteHouse(@PathVariable Long id) {
	        houseService.deleteHouse(id);
	    }
	

}
