package first.selfspring.controller;

import first.selfspring.domain.House;
import first.selfspring.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/houses")
    public List<House> getAllHouses(){
        return houseService.getAllHouses();
    }

    @PostMapping("/houses")
    public House postHouse(@RequestBody House house){
        houseService.postHouse(house);
        return house;
    }

    @GetMapping("/houses/{id}")
    public House getHouse(@PathVariable Integer id){
        return houseService.getHouse(id);
    }

    @PutMapping("/houses/{id}")
    public House updateHouse(@PathVariable Integer id, @RequestBody House house){
        return houseService.updateHouse(id, house);
    }



}
