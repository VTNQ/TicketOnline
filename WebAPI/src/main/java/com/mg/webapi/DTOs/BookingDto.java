package com.mg.webapi.DTOs;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.mg.webapi.Entities.Booking}
 */
public class BookingDto implements Serializable {
    private Integer id;
    private Integer status;
    private BigDecimal totalPrice;
    private int trip;
    private int tripReturn;

    public BookingDto() {
    }

    public int getTrip() {
        return trip;
    }

    public void setTrip(int trip) {
        this.trip = trip;
    }

    public int getTripReturn() {
        return tripReturn;
    }

    public void setTripReturn(int tripReturn) {
        this.tripReturn = tripReturn;
    }

    public BookingDto(Integer id, Integer status, BigDecimal totalPrice) {
        this.id = id;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}