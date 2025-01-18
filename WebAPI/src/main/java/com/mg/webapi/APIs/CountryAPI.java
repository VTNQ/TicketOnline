package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.CountryDto;
import com.mg.webapi.Entities.Country;
import com.mg.webapi.Services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/countries")
public class CountryAPI {
    @Autowired
    private CountryService countryService;

    @GetMapping("findById")
    public ResponseEntity<CountryDto> findById(@RequestParam int id) {
        try {
            return new ResponseEntity<CountryDto>(countryService.getCountryById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
