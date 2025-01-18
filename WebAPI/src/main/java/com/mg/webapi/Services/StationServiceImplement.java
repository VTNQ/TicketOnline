package com.mg.webapi.Services;

import com.mg.webapi.DTOs.StationDto;
import com.mg.webapi.Reposities.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationServiceImplement implements StationService {
    @Autowired
    private StationRepository stationRepository;

    @Override
    public StationDto getStationById(int id) {
        try {
            return stationRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
