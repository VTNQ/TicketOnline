package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.DistrictDto;
import com.mg.webapi.Entities.District;
import com.mg.webapi.Services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/districts")
public class DistrictAPI {
    @Autowired
    private DistrictService districtService;

    @GetMapping("findById")
    public ResponseEntity<DistrictDto> findById(int id) {
        try {
            return new ResponseEntity<DistrictDto>(districtService.getDistrictById(id), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
