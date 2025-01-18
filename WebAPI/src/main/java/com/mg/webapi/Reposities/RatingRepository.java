package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.RatingDto;
import com.mg.webapi.Entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
    @Query("from Rating r where r.brand.id=:Id")
    List<RatingDto> findByBrandId(int Id);
}