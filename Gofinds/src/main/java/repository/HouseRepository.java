package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.House;

public interface HouseRepository extends JpaRepository<House, Long> {

}
