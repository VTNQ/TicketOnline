package com.mg.webapi.DTOs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.DateTimeException;
import java.time.Instant;

/**
 * DTO for {@link com.mg.webapi.Entities.Trip}
 */
public class TripDto implements Serializable {
    private Integer id;
    private String dateFrom;
    private String dateTo;
    private BigDecimal price;
    private int locationFrom;
    private int locationTo;
    private int car;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(int locationFrom) {
        this.locationFrom = locationFrom;
    }

    public int getLocationTo() {
        return locationTo;
    }

    public void setLocationTo(int locationTo) {
        this.locationTo = locationTo;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }
}