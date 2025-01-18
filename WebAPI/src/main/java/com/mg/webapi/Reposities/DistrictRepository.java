package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.DistrictDto;
import com.mg.webapi.Entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {
    @Query("from District where id=:Id")
    DistrictDto getDistrictById(int Id);
}