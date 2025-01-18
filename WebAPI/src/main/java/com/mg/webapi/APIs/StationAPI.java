package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.StationDto;
import com.mg.webapi.Services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stations")
public class StationAPI {
    @Autowired
    private StationService stationService;

    @GetMapping("findById")
    public ResponseEntity<StationDto> findById(@RequestParam int id) {
        try {
            return new ResponseEntity<StationDto>(stationService.getStationById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
