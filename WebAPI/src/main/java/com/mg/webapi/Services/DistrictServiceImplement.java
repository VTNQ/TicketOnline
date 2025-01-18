package com.mg.webapi.Services;

import com.mg.webapi.DTOs.DistrictDto;
import com.mg.webapi.Reposities.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImplement implements DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public DistrictDto getDistrictById(int id) {
        try {
            return districtRepository.getDistrictById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
