package com.mg.webapi.Reposities;

import com.mg.webapi.Entities.CarUtility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarUtilityRepository extends JpaRepository<CarUtility, Integer> {
}