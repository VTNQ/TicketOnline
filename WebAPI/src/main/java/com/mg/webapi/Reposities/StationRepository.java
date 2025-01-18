package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.StationDto;
import com.mg.webapi.Entities.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
    @Query("from Station where id=:Id")
    public StationDto findById(int Id);
}