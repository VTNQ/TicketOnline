package com.mg.webapi.Services;

import com.mg.webapi.DTOs.BrandDto;
import com.mg.webapi.Reposities.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImplement implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public BrandDto findBrandById(int id) {
        try {
            return brandRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
