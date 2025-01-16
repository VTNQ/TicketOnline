package com.mg.webapi.DTOs;

import java.io.Serializable;

/**
 * DTO for {@link com.mg.webapi.Entities.Station}
 */
public class StationDto implements Serializable {
    private Integer id;
    private String name;
    private String location;
    private int district;

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public StationDto() {
    }

    public StationDto(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}