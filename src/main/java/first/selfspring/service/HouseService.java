package first.selfspring.service;

import first.selfspring.dao.HousesDAO;
import first.selfspring.domain.House;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface HouseService {
    List<House> getAllHouses();
    House getHouse(Integer id);
    void postHouse(House house);
    House updateHouse(Integer id, House house);
    Integer deleteHouse(Integer id);
}
