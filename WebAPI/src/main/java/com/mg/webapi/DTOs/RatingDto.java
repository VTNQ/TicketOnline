package com.mg.webapi.DTOs;

import java.io.Serializable;

/**
 * DTO for {@link com.mg.webapi.Entities.Rating}
 */
public class RatingDto implements Serializable {
    private Integer id;
    private Double value;
    private int userId;
    private int brand;

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public RatingDto() {
    }

    public RatingDto(Integer id, Double value, Integer userId) {
        this.id = id;
        this.value = value;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}