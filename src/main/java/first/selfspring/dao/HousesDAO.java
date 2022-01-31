package first.selfspring.dao;

import first.selfspring.domain.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousesDAO {
    List<House> getAllHouses();
    House getHouse(Integer id);
    void postHouse(House house);
    Integer updateHouse(@Param("id") Integer id, @Param("house") House house );
    Integer deleteHouse(Integer id);
}
