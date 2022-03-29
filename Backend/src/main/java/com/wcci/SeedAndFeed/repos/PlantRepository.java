package com.wcci.SeedAndFeed.repos;

import com.wcci.SeedAndFeed.entities.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant,Long> {
}
