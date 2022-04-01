package com.wcci.SeedAndFeed;

import com.wcci.SeedAndFeed.entities.Plant;
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

        Plant arugula = new Plant("Arugula", 33, "10-12", "Full", -21, "./images/arugula_photo.jpg");
        Plant basil = new Plant("Basil", 33, "10-12", "Full", -49, "images/basil_photo.jpg");
        Plant edamame = new Plant("Edamame", 65, "24-30", "Full", -999, "/images/edamame_photo.jpg");
        Plant bush_beans = new Plant("Bush Beans", 55, "18-30", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/bush_beans_photo.jpg");
        Plant beets = new Plant("Beets", 57, "10-12", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/beets_photo.jpg");
        Plant broccoli = new Plant("Broccoli", 50, "30-36", "Full", -42, "Backend/src/main/java/com/wcci/SeedAndFeed/images/broccoli_photo.jpg");
        Plant brussels_sprouts = new Plant("Brussels Sprouts", 90, "34-36", "Full", -70, "Backend/src/main/java/com/wcci/SeedAndFeed/images/brussels_sprouts_photo.jpg");
        Plant cabbage = new Plant("Cabbage", 90, "9-15", "Full", -56, "Backend/src/main/java/com/wcci/SeedAndFeed/images/cabbage_photo.jpg");
        Plant carrots = new Plant("Carrots", 64, "4-8", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/carrots_photo.jpg");
        Plant cauliflower = new Plant("Cauliflower", 31, "12-14", "Full", -56, "Backend/src/main/java/com/wcci/SeedAndFeed/images/cauliflower_photo.jpg");
        Plant celery = new Plant("Celery", 95, "18-24", "Full", -77, "Backend/src/main/java/com/wcci/SeedAndFeed/images/celery_photo.jpg");
        Plant swiss_chard = new Plant("Swiss Chard", 60, "12-16", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/swiss_chard_photo.jpg");
        Plant cilantro = new Plant("Cilantro", 75, "18-24", "Full", -49, "Backend/src/main/java/com/wcci/SeedAndFeed/images/cilantro_photo.jpg");
        Plant sweet_corn = new Plant("Sweet Corn", 75, "72-84", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/sweet_corn_photo.jpg");
        Plant collards = new Plant("Collards", 65, "24-36", "Full", 0, "Backend/src/main/java/com/wcci/SeedAndFeed/images/collards_photo.jpg");
        Plant cucumbers = new Plant("Cucumbers", 56, "15", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/cucumbers_photo.jpg");
        Plant dill = new Plant("Dill", 50, "18-24", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/dill_photo.jpg");
        Plant eggplant = new Plant("Eggplant", 45, "16-20", "Full", -56, "Backend/src/main/java/com/wcci/SeedAndFeed/images/eggplant_photo.jpg");
        Plant endive = new Plant("Endive", 55, "8-10", "Full", 0, "Backend/src/main/java/com/wcci/SeedAndFeed/images/endive_photo.jpg");
        Plant fennel = new Plant("Fennel", 75, "30", "Full", -35, "Backend/src/main/java/com/wcci/SeedAndFeed/images/fennel_photo.jpg");
        Plant garlic = new Plant("Garlic", 196, "12-18", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/garlic_photo.jpg");
        Plant kale = new Plant("Kale", 45, "24-26", "Full", -63, "Backend/src/main/java/com/wcci/SeedAndFeed/images/kale_photo.jpg");
        Plant kohlrabi = new Plant("Kohlrabi", 43, "12-18", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/kohlrabi_photo.jpg");
        Plant leeks = new Plant("Leeks", 105, "24", "Full", -63, "Backend/src/main/java/com/wcci/SeedAndFeed/images/leeks_photo.jpg");
        Plant bibb_lettuce = new Plant("Bibb Lettuce", 75, "9-15", "Full or Part", -63, "Backend/src/main/java/com/wcci/SeedAndFeed/images/bibb_lettuce_photo.jpg");
        Plant mustard_greens = new Plant("Mustard Greens", 50, "8-12", "Full", -21, "Backend/src/main/java/com/wcci/SeedAndFeed/images/mustard_greens_photo.jpg");
        Plant okra = new Plant("Okra", 63, "60-84", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/okra_photo.jpg");
        Plant onions = new Plant("Onions", 110, "24-30", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/onions_photo.jpg");
        Plant parsley = new Plant("Parsley", 75, "18", "Full or Part", -63, "Backend/src/main/java/com/wcci/SeedAndFeed/images/parsley_photo.jpg");
        Plant parsnips = new Plant("Parsnips", 105, "10-15", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/parsnips_photo.jpg");
        Plant peanuts = new Plant("Peanuts", 120, "12-18", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/peanuts_photo.jpg");
        Plant sugar_snap_peas = new Plant("Sugar Snap Peas", 70, "48-72", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/sugar_snap_peas_photo.jpg");
        Plant cayenne_peppers = new Plant("Cayenne Peppers", 68, "24-36", "Full", -63, "Backend/src/main/java/com/wcci/SeedAndFeed/images/cayenne_peppers_photo.jpg");
        Plant bell_peppers = new Plant("Bell Peppers", 70, "32-36", "Full", -63, "Backend/src/main/java/com/wcci/SeedAndFeed/images/bell_peppers_photo.jpg");
        Plant potatoes = new Plant("Potatoes", 62, "38", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/potatoes_photo.jpg");
        Plant raab = new Plant("Raab", 55, "24-36", "Full", -28, "Backend/src/main/java/com/wcci/SeedAndFeed/images/raab_photo.jpg");
        Plant radicchio = new Plant("Radicchio", 90, "6", "Full", -17, "Backend/src/main/java/com/wcci/SeedAndFeed/images/radicchio_photo.jpg");
        Plant radishes = new Plant("Radishes", 30, "6-7", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/radishes_photo.jpg");
        Plant rutabagas = new Plant("Rutabagas", 90, "12-14", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/rutabagas_photo.jpg");
        Plant scallions = new Plant("Scallions", 60, "24-30", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/scallions_photo.jpg");
        Plant spinach = new Plant("Spinach", 37, "10-12", "Full", 0, "Backend/src/main/java/com/wcci/SeedAndFeed/images/spinach_photo.jpg");
        Plant zucchini = new Plant("Zucchini", 50, "12", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/zucchini_photo.jpg");
        Plant pumpkin = new Plant("Pumpkin", 110, "12-18", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/pumpkin_photo.jpg");
        Plant acorn_squash = new Plant("Acorn Squash", 80, "10-12", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/acorn_squash_photo.jpg");
        Plant beefsteak_tomato = new Plant("Beefsteak Tomato", 85, "36-42", "Full", -49, "Backend/src/main/java/com/wcci/SeedAndFeed/images/beefsteak_tomato_photo.jpg");
        Plant turnips = new Plant("Turnips", 55, "12-15", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/turnips_photo.jpg");
        Plant watermelon = new Plant("Watermelon", 90, "7", "Full", -999, "Backend/src/main/java/com/wcci/SeedAndFeed/images/watermelon_photo.jpg");


        plantRepo.save(arugula);
        plantRepo.save(basil);
        plantRepo.save(edamame);
        plantRepo.save(bush_beans);
        plantRepo.save(beets);
        plantRepo.save(broccoli);
        plantRepo.save(brussels_sprouts);
        plantRepo.save(cabbage);
        plantRepo.save(carrots);
        plantRepo.save(cauliflower);
        plantRepo.save(celery);
        plantRepo.save(swiss_chard);
        plantRepo.save(cilantro);
        plantRepo.save(sweet_corn);
        plantRepo.save(collards);
        plantRepo.save(cucumbers);
        plantRepo.save(dill);
        plantRepo.save(eggplant);
        plantRepo.save(endive);
        plantRepo.save(fennel);
        plantRepo.save(garlic);
        plantRepo.save(kale);
        plantRepo.save(kohlrabi);
        plantRepo.save(leeks);
        plantRepo.save(bibb_lettuce);
        plantRepo.save(mustard_greens);
        plantRepo.save(okra);
        plantRepo.save(onions);
        plantRepo.save(parsley);
        plantRepo.save(parsnips);
        plantRepo.save(peanuts);
        plantRepo.save(sugar_snap_peas);
        plantRepo.save(cayenne_peppers);
        plantRepo.save(bell_peppers);
        plantRepo.save(potatoes);
        plantRepo.save(raab);
        plantRepo.save(radicchio);
        plantRepo.save(radishes);
        plantRepo.save(rutabagas);
        plantRepo.save(scallions);
        plantRepo.save(spinach);
        plantRepo.save(zucchini);
        plantRepo.save(pumpkin);
        plantRepo.save(acorn_squash);
        plantRepo.save(beefsteak_tomato);
        plantRepo.save(turnips);
        plantRepo.save(watermelon);

    }


}
