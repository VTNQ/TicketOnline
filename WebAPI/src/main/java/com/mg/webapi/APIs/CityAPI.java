package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.CityDto;
import com.mg.webapi.Entities.City;
import com.mg.webapi.Services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cities")
public class CityAPI {
    @Autowired
    private CityService cityService;

    @GetMapping("findById")
    public ResponseEntity<CityDto> findById(@RequestParam int id) {
        try {
            return new ResponseEntity<CityDto>(cityService.getCityById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
