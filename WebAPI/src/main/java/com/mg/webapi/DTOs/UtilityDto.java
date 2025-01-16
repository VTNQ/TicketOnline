package com.mg.webapi.DTOs;

import java.io.Serializable;

/**
 * DTO for {@link com.mg.webapi.Entities.Utility}
 */
public class UtilityDto implements Serializable {
    private Integer id;
    private String name;

    public UtilityDto() {
    }

    public UtilityDto(Integer id, String name) {
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