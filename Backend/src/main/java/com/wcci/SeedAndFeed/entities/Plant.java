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
    private String careTips;
    private String companionPlants;


    public Plant(String name, int maturityDays, String height, String sunExposure, int indoorCalc, String photoLink,
                 String careTips, String companionPlants) {
        this.name = name;
        this.maturityDays = maturityDays;
        this.height = height;
        this.sunExposure = sunExposure;
        this.indoorCalc = indoorCalc;
        this.photoLink = photoLink;
        this.careTips = careTips;
        this.companionPlants = companionPlants;
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

    public String getCareTips() {
        return careTips;
    }

    public String getCompanionPlants() { return companionPlants;}
}
