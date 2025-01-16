package com.mg.webapi.DTOs;

import java.io.Serializable;

/**
 * DTO for {@link com.mg.webapi.Entities.Brand}
 */
public class BrandDto implements Serializable {
    private Integer id;
    private String name;
    private String locateAt;
    private int district;

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public BrandDto() {
    }

    public BrandDto(Integer id, String name, String locateAt) {
        this.id = id;
        this.name = name;
        this.locateAt = locateAt;
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

    public String getLocateAt() {
        return locateAt;
    }

    public void setLocateAt(String locateAt) {
        this.locateAt = locateAt;
    }
}