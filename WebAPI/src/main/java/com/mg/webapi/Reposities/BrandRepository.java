package com.mg.webapi.Reposities;

import com.mg.webapi.DTOs.BrandDto;
import com.mg.webapi.Entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    @Query("from Brand where id=:Id")
    public BrandDto findById(int Id);
}