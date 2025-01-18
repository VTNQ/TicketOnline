package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.TripDto;
import com.mg.webapi.Entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Integer> {
    @Query("from Trip where locationFrom=:Location_from and locationTo=:Location_To and dateFrom=:Date_from and dateTo=:Date_to")
    List<TripDto> getTrip(@Param("Location_from")int locationFrom, @Param("Location_To")int locationTo, @Param("Date_from") LocalDate dateFrom, @Param("Date_to")LocalDate dateTo);

    @Query("from Trip where id=:Id")
    TripDto getTripById(@Param("Id") int id);
}