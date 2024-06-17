package service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.ResourceNotFoundException;
import model.House;
import repository.HouseRepository;
import exception.ResourceNotFoundException;


@Service
public class HouseService {
	
	 @Autowired
	    private HouseRepository houseRepository;

	    public List<House> getAllHouses() {
	        return houseRepository.findAll();
	    }

	    public Optional<House> getHouseById(Long id) {
	        return houseRepository.findById(id);
	        		//.orElseThrow(() -> new ResourceNotFoundException("House not found"));
	    }

	    public House saveHouse(House house) {
	        return houseRepository.save(house);
	    }

	    public void deleteHouse(Long id) {
	        houseRepository.deleteById(id);
	    }


}
