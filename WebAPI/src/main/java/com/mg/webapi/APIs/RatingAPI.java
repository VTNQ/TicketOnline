package com.mg.webapi.APIs;

import com.mg.webapi.DTOs.RatingDto;
import com.mg.webapi.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/ratings")
public class RatingAPI {
    @Autowired
    private RatingService ratingService;

    @GetMapping("getByBrandId")
    public ResponseEntity<List<RatingDto>> getByBrandId(@RequestParam("brandId") int brandId) {
        try {
            return new ResponseEntity<List<RatingDto>>(ratingService.getRatingByBrandId(brandId), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
