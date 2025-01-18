package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.TripDto;
import com.mg.webapi.Entities.Trip;
import com.mg.webapi.Services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("api/v1/trips")
public class TripAPI {
    @Autowired
    private TripService tripService;

    @GetMapping("find")
    public ResponseEntity<List<TripDto>> find(@RequestParam int location_to, @RequestParam int location_from,@RequestParam String date_from,@RequestParam String date_to) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return new ResponseEntity<List<TripDto>>(tripService.getTrip(location_from,location_to, LocalDate.parse(date_from,formatter),LocalDate.parse(date_to,formatter)), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("getTripById")
    public ResponseEntity<TripDto> getTripById(@RequestParam int trip_id) {
        try {
            return new ResponseEntity<>(tripService.getTripById(trip_id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
