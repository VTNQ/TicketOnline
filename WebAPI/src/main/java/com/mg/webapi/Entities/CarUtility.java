package com.mg.webapi.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "car_utilities")
public class CarUtility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "trip_id", nullable = false)
    private Trip trip;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "utilities_id", nullable = false)
    private Utility utilities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Utility getUtilities() {
        return utilities;
    }

    public void setUtilities(Utility utilities) {
        this.utilities = utilities;
    }

}