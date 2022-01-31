package first.selfspring.controller;

import first.selfspring.domain.House;
import first.selfspring.service.HouseService;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/houses")
    @ApiOperation(value = "전체 집 리스트", notes = "등록된 집 목록을 모두 반환")
    public List<House> getAllHouses(){
        return houseService.getAllHouses();
    }

    @PostMapping("/houses")
    @ApiOperation(value = "집 등록", notes = "집 등록 API")
    public House postHouse(@RequestBody House house){
        houseService.postHouse(house);
        return house;
    }

    @GetMapping("/houses/{id}")
    @ApiOperation(value = "집(id) 검색", notes = "특정 집 검색 API(id 기준)")
    public House getHouse(@PathVariable Integer id){
        return houseService.getHouse(id);
    }

    @PutMapping("/houses/{id}")
    @ApiOperation(value = "집(id) 수정", notes = "특정 집 정보 수정 API(id 기준)")
    public House updateHouse(@PathVariable Integer id, @RequestBody House house){
        return houseService.updateHouse(id, house);
    }

    @DeleteMapping("/houses/{id}")
    @ApiOperation(value = "집(id) 삭제", notes = "특정 집 정보 삭제 API(id 기준)")
    public Integer deleteHouse(@PathVariable Integer id){
        return houseService.deleteHouse(id);
    }

    @GetMapping("/swagger")
    @ApiIgnore
    public void swaggerRedirect(HttpServletResponse response) {
        response.setHeader("Location", "/swagger-ui/index.html#/");
        response.setStatus(302);
    }
}
