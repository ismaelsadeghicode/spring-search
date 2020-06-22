package com.javatar2.search.domain;

import javax.persistence.*;

/**
 * @author Esmaeil Sadeghi, 6/22/2020 11:40 AM
 */
@Entity
@Table(name = "options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "has_gps")
    private String hasGPS;

    private String transmission;

    public String getHasgps() {
        return hasGPS;
    }

    public void setHasGPS(String hasGPS) {
        this.hasGPS = hasGPS;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}