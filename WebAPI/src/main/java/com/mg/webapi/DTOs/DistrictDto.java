package com.mg.webapi.DTOs;

import java.io.Serializable;

/**
 * DTO for {@link com.mg.webapi.Entities.District}
 */
public class DistrictDto implements Serializable {
    private Integer id;
    private String name;
    private int city;

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public DistrictDto() {
    }

    public DistrictDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}