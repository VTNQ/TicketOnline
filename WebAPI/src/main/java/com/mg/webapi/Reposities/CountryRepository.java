package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.CountryDto;
import com.mg.webapi.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    @Query("from Country where id=:Id")
    CountryDto getCountryById(int Id);
}