package com.mg.webapi.Services;

import com.mg.webapi.DTOs.RatingDto;
import com.mg.webapi.Reposities.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImplement implements RatingService {
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public List<RatingDto> getRatingByBrandId(int brandId) {
        try {
            return ratingRepository.findByBrandId(brandId);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
