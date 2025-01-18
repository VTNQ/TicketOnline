package com.mg.webapi.Services;

import com.mg.webapi.DTOs.CityDto;
import com.mg.webapi.Reposities.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImplement implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public CityDto getCityById(int id) {
        try {
           return cityRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
