package com.wcci.SeedAndFeed.controller;

import com.wcci.SeedAndFeed.entities.Plant;
import com.wcci.SeedAndFeed.repos.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {
   private PlantRepository plantRepo;

    public PlantController(PlantRepository plantRepo) {
        this.plantRepo = plantRepo;
    }

    @GetMapping("/")
    public Iterable<Plant> getPlants() {
        return plantRepo.findAll();
    }

    @GetMapping("/plant/{id}")
    public Plant getSinglePlant(@PathVariable long id) {
        return plantRepo.findById(id).get();
    }

    
}
