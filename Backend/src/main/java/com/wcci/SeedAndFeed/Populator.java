package com.wcci.SeedAndFeed;

import com.wcci.SeedAndFeed.repos.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class Populator implements CommandLineRunner {
    @Autowired
    PlantRepository plantRepo;

    @Override
    public void run(String... args) throws Exception{

        //Populator stuff starts here
    }


}
