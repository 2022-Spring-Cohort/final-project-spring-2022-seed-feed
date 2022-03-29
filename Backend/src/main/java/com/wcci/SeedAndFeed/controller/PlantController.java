package com.wcci.SeedAndFeed.controller;

import com.wcci.SeedAndFeed.repos.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {
   private PlantRepository plantRepo;

    public PlantController(PlantRepository plantRepo) {
        this.plantRepo = plantRepo;
    }

    
}
