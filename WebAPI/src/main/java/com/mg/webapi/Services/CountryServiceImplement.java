package com.mg.webapi.Services;

import com.mg.webapi.DTOs.CountryDto;
import com.mg.webapi.Reposities.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImplement implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public CountryDto getCountryById(int id) {
        try {
            return countryRepository.getCountryById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
