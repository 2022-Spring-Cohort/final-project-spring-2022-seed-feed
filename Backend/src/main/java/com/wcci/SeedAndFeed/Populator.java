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

        Plant Arugula = new Plant("Arugula", 33, "10-12", "Full", -21, "Backend/src/main/java/com/wcci/SeedAndFeed/images/arugula_photo.jpg");
        Plant Basil = new Plant("Basil", 33, "10-12", "Full", -49, "src=src/Basil");
        Plant Edamame = new Plant("Edamame", 65, "24-30", "Full", -999, "src=src/Edamame");
        Plant Bush_Beans = new Plant("Bush Beans", 55, "18-30", "Full", -999, "src=src/Bush_Beans");
        Plant Beets = new Plant("Beets", 57, "10-12", "Full", -999, "src=src/Beets");
        Plant Broccoli = new Plant("Broccoli", 50, "30-36", "Full", -42, "src=src/Broccoli");
        Plant Brussels_Sprouts = new Plant("Brussels Sprouts", 90, "34-36", "Full", -70, "src=src/Brussels_Sprouts");
        Plant Cabbage = new Plant("Cabbage", 90, "9-15", "Full", -56, "src=src/Cabbage");
        Plant Carrots = new Plant("Carrots", 64, "4-8", "Full", -999, "src=src/Carrots");
        Plant Cauliflower = new Plant("Cauliflower", 31, "12-14", "Full", -56, "src=src/Cauliflower");
        Plant Celery = new Plant("Celery", 95, "18-24", "Full", -77, "src=src/Celery");
        Plant Swiss_Chard = new Plant("Swiss Chard", 60, "12-16", "Full", -999, "src=src/Swiss_Chard");
        Plant Cilantro = new Plant("Cilantro", 75, "18-24", "Full", -49, "src=src/Cilantro");
        Plant Sweet_Corn = new Plant("Sweet Corn", 75, "72-84", "Full", -999, "src=src/Sweet_Corn");
        Plant Collards = new Plant("Collards", 65, "24-36", "Full", 0, "src=src/Collards");
        Plant Cucumbers = new Plant("Cucumbers", 56, "15", "Full", -999, "src=src/Cucumbers");
        Plant Dill = new Plant("Dill", 50, "18-24", "Full", -999, "src=src/Dill");
        Plant Eggplant = new Plant("Eggplant", 45, "16-20", "Full", -56, "src=src/Eggplant");
        Plant Endive = new Plant("Endive", 55, "8-10", "Full", 0, "src=src/Endive");
        Plant Fennel = new Plant("Fennel", 75, "30", "Full", -35, "src=src/Fennel");
        Plant Garlic = new Plant("Garlic", 196, "12-18", "Full", -999, "src=src/Garlic");
        Plant Kale = new Plant("Kale", 45, "24-26", "Full", -63, "src=src/Kale");
        Plant Kohlrabi = new Plant("Kohlrabi", 43, "12-18", "Full", -999, "src=src/Kohlrabi");
        Plant Leeks = new Plant("Leeks", 105, "24", "Full", -63, "src=src/Leeks");
        Plant Bibb_Lettuce = new Plant("Bibb Lettuce", 75, "9-15", "Full or Part", -63, "src=src/Bibb_Lettuce");
        Plant Mustard_Greens = new Plant("Mustard Greens", 50, "8-12", "Full", -21, "src=src/Mustard_Greens");
        Plant Okra = new Plant("Okra", 63, "60-84", "Full", -999, "src=src/Okra");
        Plant Onions = new Plant("Onions", 110, "24-30", "Full", -999, "src=src/Onions");
        Plant Parsley = new Plant("Parsley", 75, "18", "Full or Part", -63, "src=src/Parsley");
        Plant Parsnips = new Plant("Parsnips", 105, "10-15", "Full", -999, "src=src/Parsnips");
        Plant Peanuts = new Plant("Peanuts", 120, "12-18", "Full", -999, "src=src/Peanuts");
        Plant Sugar_Snap_Peas = new Plant("Sugar Snap Peas", 70, "48-72", "Full", -999, "src=src/Sugar_Snap_Peas");
        Plant Cayenne_Peppers = new Plant("Cayenne Peppers", 68, "24-36", "Full", -63, "src=src/Cayenne_Peppers");
        Plant Bell_Peppers = new Plant("Bell Peppers", 70, "32-36", "Full", -63, "src=src/Bell_Peppers");
        Plant Potatoes = new Plant("Potatoes", 62, "38", "Full", -999, "src=src/Potatoes");
        Plant Raab = new Plant("Raab", 55, "24-36", "Full", -28, "src=src/Raab");
        Plant Radicchio = new Plant("Radicchio", 90, "6", "Full", -17, "src=src/Radicchio");
        Plant Radishes = new Plant("Radishes", 30, "6-7", "Full", -999, "src=src/Radishes");
        Plant Rutabagas = new Plant("Rutabagas", 90, "12-14", "Full", -999, "src=src/Rutabagas");
        Plant Scallions = new Plant("Scallions", 60, "24-30", "Full", -999, "src=src/Scallions");
        Plant Spinach = new Plant("Spinach", 37, "10-12", "Full", 0, "src=src/Spinach");
        Plant Zucchini = new Plant("Zucchini", 50, "12", "Full", -999, "src=src/Zucchini");
        Plant Pumpkin = new Plant("Pumpkin", 110, "12-18", "Full", -999, "src=src/Pumpkin");
        Plant Acorn_Squash = new Plant("Acorn Squash", 80, "10-12", "Full", -999, "src=src/Acorn_Squash");
        Plant Beefsteak_Tomato = new Plant("Beefsteak Tomato", 85, "36-42", "Full", -49, "src=src/Beefsteak_Tomato");
        Plant Turnips = new Plant("Turnips", 55, "12-15", "Full", -999, "src=src/Turnips");
        Plant Watermelon = new Plant("Watermelon", 90, "7", "Full", -999, "src=src/Watermelon");

        plantRepo.save(Arugula);
        plantRepo.save(Basil);
        plantRepo.save(Edamame);
        plantRepo.save(Bush_Beans);
        plantRepo.save(Beets);
        plantRepo.save(Broccoli);
        plantRepo.save(Brussels_Sprouts);
        plantRepo.save(Cabbage);
        plantRepo.save(Carrots);
        plantRepo.save(Cauliflower);
        plantRepo.save(Celery);
        plantRepo.save(Swiss_Chard);
        plantRepo.save(Cilantro);
        plantRepo.save(Sweet_Corn);
        plantRepo.save(Collards);
        plantRepo.save(Cucumbers);
        plantRepo.save(Dill);
        plantRepo.save(Eggplant);
        plantRepo.save(Endive);
        plantRepo.save(Fennel);
        plantRepo.save(Garlic);
        plantRepo.save(Kale);
        plantRepo.save(Kohlrabi);
        plantRepo.save(Leeks);
        plantRepo.save(Bibb_Lettuce);
        plantRepo.save(Mustard_Greens);
        plantRepo.save(Okra);
        plantRepo.save(Onions);
        plantRepo.save(Parsley);
        plantRepo.save(Parsnips);
        plantRepo.save(Peanuts);
        plantRepo.save(Sugar_Snap_Peas);
        plantRepo.save(Cayenne_Peppers);
        plantRepo.save(Bell_Peppers);
        plantRepo.save(Potatoes);
        plantRepo.save(Raab);
        plantRepo.save(Radicchio);
        plantRepo.save(Radishes);
        plantRepo.save(Rutabagas);
        plantRepo.save(Scallions);
        plantRepo.save(Spinach);
        plantRepo.save(Zucchini);
        plantRepo.save(Pumpkin);
        plantRepo.save(Acorn_Squash);
        plantRepo.save(Beefsteak_Tomato);
        plantRepo.save(Turnips);
        plantRepo.save(Watermelon);
    }


}
