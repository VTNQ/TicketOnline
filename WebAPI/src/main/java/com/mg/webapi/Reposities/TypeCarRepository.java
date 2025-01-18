package com.mg.webapi.Reposities;

import com.mg.webapi.Entities.TypeCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCarRepository extends JpaRepository<TypeCar, Integer> {
}