package com.mg.webapi.Services;

import com.mg.webapi.DTOs.TripDto;
import com.mg.webapi.Entities.Trip;

import java.time.LocalDate;
import java.util.List;

public interface TripService {
    public List<TripDto> getTrip(int location_from, int location_to, LocalDate date_from, LocalDate date_to);
    public TripDto getTripById(int id);
}
