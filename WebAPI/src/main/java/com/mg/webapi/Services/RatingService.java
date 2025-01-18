package com.mg.webapi.Services;

import com.mg.webapi.DTOs.RatingDto;
import com.mg.webapi.Entities.Rating;

import java.util.List;

public interface RatingService {
    public List<RatingDto> getRatingByBrandId(int brandId);
}
