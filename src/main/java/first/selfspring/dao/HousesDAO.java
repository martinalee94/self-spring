package first.selfspring.dao;

import first.selfspring.domain.House;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousesDAO {
    List<House> getAllHouses();
    House getHouse(Integer id);
    void postHouse(House house);

}
