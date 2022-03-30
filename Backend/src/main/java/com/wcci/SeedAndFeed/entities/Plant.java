package com.wcci.SeedAndFeed.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plant {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int maturityDays;
    private String height;
    private String sunExposure;
    private int indoorCalc;
    private String photoLink;


    public Plant(String name, int maturityDays, String height, String sunExposure, int indoorCalc, String photoLink) {
        this.name = name;
        this.maturityDays = maturityDays;
        this.height = height;
        this.sunExposure = sunExposure;
        this.indoorCalc = indoorCalc;
        this.photoLink = photoLink;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaturityDays() {
        return maturityDays;
    }

    public String getHeight() {
        return height;
    }

    public String getSunExposure() {
        return sunExposure;
    }

    public int getIndoorCalc() {
        return indoorCalc;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public Plant(){
    }
}
