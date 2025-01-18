package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.CityDto;
import com.mg.webapi.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    @Query("from City where id=:Id")
    CityDto findById(int Id);
}