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

        Plant arugula = new Plant("Arugula", 33, "10-12", "Full", -21, "./img/arugula_photo.jpg");
        Plant basil = new Plant("Basil", 33, "10-12", "Full", -49, "./img/basil_photo.jpg");
        Plant edamame = new Plant("Edamame", 65, "24-30", "Full", -999, "./img/edamame_photo.jpg");
        Plant green_beans = new Plant("Green Beans", 55, "18-30", "Full", -999, "./img/bush_beans_photo.jpg");
        Plant beets = new Plant("Beets", 57, "10-12", "Full", -999, "./img/beets_photo.jpg");
        Plant broccoli = new Plant("Broccoli", 50, "30-36", "Full", -42, "./img/broccoli_photo.jpg");
        Plant brussels_sprouts = new Plant("Brussels Sprouts", 90, "34-36", "Full", -70, "./img/brussels_sprouts_photo.jpg");
        Plant cabbage = new Plant("Cabbage", 90, "9-15", "Full", -56, "./img/cabbage_photo.jpg");
        Plant carrots = new Plant("Carrots", 64, "4-8", "Full", -999, "./img/carrots_photo.jpg");
        Plant cauliflower = new Plant("Cauliflower", 31, "12-14", "Full", -56, "./img/cauliflower_photo.jpg");
        Plant celery = new Plant("Celery", 95, "18-24", "Full", -77, "./img/celery_photo.jpg");
        Plant swiss_chard = new Plant("Swiss Chard", 60, "12-16", "Full", -999, "./img/swiss_chard_photo.jpg");
        Plant cilantro = new Plant("Cilantro", 75, "18-24", "Full", -49, "./img/cilantro_photo.jpg");
        Plant sweet_corn = new Plant("Sweet Corn", 75, "72-84", "Full", -999, "./img/sweet_corn_photo.jpg");
        Plant collards = new Plant("Collards", 65, "24-36", "Full", 0, "./img/collards_photo.jpg");
        Plant cucumbers = new Plant("Cucumbers", 56, "15", "Full", -999, "./img/cucumbers_photo.jpg");
        Plant dill = new Plant("Dill", 50, "18-24", "Full", -999, "./img/dill_photo.jpg");
        Plant eggplant = new Plant("Eggplant", 45, "16-20", "Full", -56, "./img/eggplant_photo.jpg");
        Plant endive = new Plant("Endive", 55, "8-10", "Full", 0, "./img/endive_photo.jpg");
        Plant fennel = new Plant("Fennel", 75, "30", "Full", -35, "./img/fennel_photo.jpg");
        Plant garlic = new Plant("Garlic", 196, "12-18", "Full", -999, "./img/garlic_photo.jpg");
        Plant kale = new Plant("Kale", 45, "24-26", "Full", -63, "./img/kale_photo.jpg");
        Plant kohlrabi = new Plant("Kohlrabi", 43, "12-18", "Full", -999, "./img/kohlrabi_photo.jpg");
        Plant leeks = new Plant("Leeks", 105, "24", "Full", -63, "./img/leeks_photo.jpg");
        Plant bibb_lettuce = new Plant("Bibb Lettuce", 75, "9-15", "Full or Part", -63, "./img/bibb_lettuce_photo.jpg");
        Plant mustard_greens = new Plant("Mustard Greens", 50, "8-12", "Full", -21, "./img/mustard_greens_photo.jpg");
        Plant okra = new Plant("Okra", 63, "60-84", "Full", -999, "./img/okra_photo.jpg");
        Plant onions = new Plant("Onions", 110, "24-30", "Full", -999, "./img/onions_photo.jpg");
        Plant parsley = new Plant("Parsley", 75, "18", "Full or Part", -63, "./img/parsley_photo.jpg");
        Plant parsnips = new Plant("Parsnips", 105, "10-15", "Full", -999, "./img/parsnips_photo.jpg");
        Plant peanuts = new Plant("Peanuts", 120, "12-18", "Full", -999, "./img/peanuts_photo.jpg");
        Plant sugar_snap_peas = new Plant("Sugar Snap Peas", 70, "48-72", "Full", -999, "./img/sugar_snap_peas_photo.png");
        Plant cayenne_peppers = new Plant("Cayenne Peppers", 68, "24-36", "Full", -63, "./img/cayenne_peppers_photo.jpg");
        Plant bell_peppers = new Plant("Bell Peppers", 70, "32-36", "Full", -63, "./img/bell_peppers_photo.jpg");
        Plant potatoes = new Plant("Potatoes", 62, "38", "Full", -999, "./img/potatoes_photo.jpg");
        Plant raab = new Plant("Raab", 55, "24-36", "Full", -28, "./img/raab_photo.jpg");
        Plant radicchio = new Plant("Radicchio", 90, "6", "Full", -17, "./img/radicchio_photo.jpg");
        Plant radishes = new Plant("Radishes", 30, "6-7", "Full", -999, "./img/radishes_photo.jpg");
        Plant rutabagas = new Plant("Rutabagas", 90, "12-14", "Full", -999, "./img/rutabagas_photo.jpg");
        Plant scallions = new Plant("Scallions", 60, "24-30", "Full", -999, "./img/scallions_photo.jpg");
        Plant spinach = new Plant("Spinach", 37, "10-12", "Full", 0, "./img/spinach_photo.jpg");
        Plant zucchini = new Plant("Zucchini", 50, "12", "Full", -999, "./img/zucchini_photo.jpg");
        Plant pumpkin = new Plant("Pumpkin", 110, "12-18", "Full", -999, "./img/pumpkin_photo.jpg");
        Plant acorn_squash = new Plant("Acorn Squash", 80, "10-12", "Full", -999, "./img/acorn_squash_photo.jpg");
        Plant beefsteak_tomato = new Plant("Beefsteak Tomato", 85, "36-42", "Full", -49, "./img/beefsteak_tomato_photo.jpg");
        Plant turnips = new Plant("Turnips", 55, "12-15", "Full", -999, "./img/turnips_photo.jpg");
        Plant watermelon = new Plant("Watermelon", 90, "7", "Full", -999, "./img/watermelon_photo.jpg");


        plantRepo.save(arugula);
        plantRepo.save(basil);
        plantRepo.save(edamame);
        plantRepo.save(green_beans);
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
