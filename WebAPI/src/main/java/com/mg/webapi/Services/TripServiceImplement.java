package com.mg.webapi.Services;

import com.mg.webapi.DTOs.TripDto;
import com.mg.webapi.Entities.Trip;
import com.mg.webapi.Reposities.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TripServiceImplement implements TripService {
    @Autowired
    private TripRepository tripRepository;

    @Override
    public List<TripDto> getTrip(int location_from, int location_to, LocalDate date_from, LocalDate date_to) {
        try {
            return tripRepository.getTrip(location_from,location_to,date_from,date_to);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public TripDto getTripById(int id) {
        try {
            return tripRepository.getTripById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
