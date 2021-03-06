package first.selfspring.service;

import first.selfspring.dao.HousesDAO;
import first.selfspring.domain.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{
    @Autowired
    private HousesDAO dao;

    @Override
    public List<House> getAllHouses() {
        return dao.getAllHouses();
    }

    @Override
    public House getHouse(Integer id) {
        return dao.getHouse(id);
    }

    @Override
    public void postHouse(House house) {
        dao.postHouse(house);
    }

    @Override
    public House updateHouse(Integer id, House house) {
        House updateHouse = new House();
        int result = dao.updateHouse(id, house);
        if ( result == 1 ){
            updateHouse.setId(id);
            updateHouse.setOwner(house.getOwner());
            updateHouse.setType(house.getType());
            updateHouse.setAddress(house.getAddress());
            updateHouse.setPrice(house.getPrice());
        }
        return updateHouse;
    }

    @Override
    public Integer deleteHouse(Integer id) {
        return dao.deleteHouse(id);
    }

}
