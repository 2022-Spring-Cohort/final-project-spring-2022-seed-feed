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

        Plant arugula = new Plant("Arugula", 33, "10-12", "Full", -21, "./img/arugula_photo.jpg", "Like many vegetables, arugula needs regular watering for healthy growth and optimal flavor. It has a shallow root system. Keep the soil consistently moist but not soggy, watering as soon as the top inch of soil feels dry.");
        Plant basil = new Plant("Basil", 33, "10-12", "Full", -49, "./img/basil_photo.jpg", "Basil likes to stay moist and requires approximately 1 inch of water every week. Basil is a vigorous grower requiring very little to no fertilization. pinch leaves from the tips of your basil as soon as the plant has two sets of true leaves.");
        Plant edamame = new Plant("Edamame", 65, "24-30", "Full", -999, "./img/edamame_photo.jpg", "Maintain a slightly acidic soil. Edamame thrives best with a soil pH of 6.0. Thin your plants. When the plants reach around four inches tall, thin the superfluous leaves until your plants are six inches apart, which can help prevent overcrowding.");
        Plant bush_beans = new Plant("Bush Beans", 55, "18-30", "Full", -999, "./img/bush_beans_photo.jpg", "Balance your soil pH. Green beans prefer a slightly acidic soil with a pH of around 6.0. Provide sun. Green bean plants need six to eight hours of full sun per day.");
        Plant beets = new Plant("Beets", 57, "10-12", "Full", -999, "./img/beets_photo.jpg", "Mulch and then water regularly with about 1 inch of water per square foot per week. Beets have shallow roots that are easily disturbed. Consider covering beets with a row cover to prevent pests like leaf miners from attacking the plants’ leaves.");
        Plant broccoli = new Plant("Broccoli", 50, "30-36", "Full", -42, "./img/broccoli_photo.jpg", "Plant broccoli during the cool weather of early spring and fall. Grow it in containers or an in-ground garden. Space broccoli plants according to the label (usually 18 inches apart).");
        Plant brussels_sprouts = new Plant("Brussels Sprouts", 90, "34-36", "Full", -70, "./img/brussels_sprouts_photo.jpg", "Check soil moisture regularly and give plants 1 to 1.5 inches of water weekly. Encourage an abundant harvest by feeding Brussels sprouts regularly with plant food. Harvest when heads are firm and green.");
        Plant cabbage = new Plant("Cabbage", 90, "9-15", "Full", -56, "./img/cabbage_photo.jpg", "Like most vegetables, cabbage needs at least 6 hours of full sun each day; more is better. It also needs fertile, well-drained, moist soil with plenty of rich organic matter. The soil pH should be between 6.5 and 6.8 for optimum growth.");
        Plant carrots = new Plant("Carrots", 64, "4-8", "Full", -999, "./img/carrots_photo.jpg", "Carrots prefer full sun and relatively cool soil. In a raised bed, neighboring plants will help shade the soil and keep it from getting too hot. Consistent moisture produces the tastiest carrots, so give them about 1 inch of water per week.");
        Plant cauliflower = new Plant("Cauliflower", 31, "12-14", "Full", -56, "./img/cauliflower_photo.jpg", "Like most vegetables, cauliflower needs at least 6 hours of full sun each day; more is better. It also needs fertile, well-drained, moist soil with plenty of rich organic matter. The soil pH should be between 6.5 and 6.8 for optimum growth.");
        Plant celery = new Plant("Celery", 95, "18-24", "Full", -77, "./img/celery_photo.jpg", "Make sure to keep the soil evenly moist and don’t forget to water them. Celery can’t tolerate drought of any kind. If the ground isn’t kept consistently moist, it will negatively affect the taste of the celery.");
        Plant swiss_chard = new Plant("Swiss Chard", 60, "12-16", "Full", -999, "./img/swiss_chard_photo.jpg", "Growing Swiss chard works best in rich, moist soil with a soil pH between 6.0 and 6.8. Plant about 12 to 18 inches apart in fertile soil, watering directly after planting.");
        Plant cilantro = new Plant("Cilantro", 75, "18-24", "Full", -49, "./img/cilantro_photo.jpg", "Grow cilantro in an area that receives full sun and has rich, well-drained soil with a pH of 6.2 to 6.8. Offer afternoon shade if you live in a warmer climate. Mix in several inches of aged compost or other rich organic matter in soil.");
        Plant sweet_corn = new Plant("Sweet Corn", 75, "72-84", "Full", -999, "./img/sweet_corn_photo.jpg", "Corn needs about 1 inch of water a week, particularly when the stalks begin to tassel. Water stress during pollination will result in ears with lots of missing kernels, so don’t skip watering your corn patch.");
        Plant collards = new Plant("Collards", 65, "24-36", "Full", 0, "./img/collards_photo.jpg", "Space plants 18 to 24 inches apart in an area with full sun and fertile, well-drained soil with a pH of 6.5 to 6.8. Collards do best with an even supply of water. Be sure to give them 1 to 1.5 inches of water weekly.");
        Plant cucumbers = new Plant("Cucumbers", 56, "15", "Full", -999, "./img/cucumbers_photo.jpg", "Cucumbers will grow quickly with little care. Be sure they receive an inch of water every week. When soil is warm, add a layer of straw mulch to keep fruit clean and help keep slugs and beetles away.");
        Plant dill = new Plant("Dill", 50, "18-24", "Full", -999, "./img/dill_photo.jpg", "Dill will grow in most types of soil, though it prefers well-drained, slightly acidic soil. Sprinkle a few seeds on the surface, then cover them with a very light layer of potting mix.");
        Plant eggplant = new Plant("Eggplant", 45, "16-20", "Full", -56, "./img/eggplant_photo.jpg", "Water regularly, especially when the plants are young so that they develop deep roots. Avoid overhead watering to prevent disease. Generally, eggplants should get an inch (2.5 cm.) of rain or watering per week.");
        Plant endive = new Plant("Endive", 55, "8-10", "Full", 0, "./img/endive_photo.jpg", "Endive grows best in full sun. It can tolerate only 2- to 3-hours of sun a day and still produce an edible plant, but the heads won’t be as well formed. It needs a well-drained, moist soil.");
        Plant fennel = new Plant("Fennel", 75, "30", "Full", -35, "./img/fennel_photo.jpg", "Promote excellent leaf production by regularly feeding with a water-soluble plant food. Water when the top inch of soil becomes dry. Harvest fennel leaves anytime, but avoid trimming more than one-third of the plant at once.");
        Plant garlic = new Plant("Garlic", 196, "12-18", "Full", -999, "./img/garlic_photo.jpg", "Garlic needs full sun and well-drained soil. Thanks to its deep roots, garlic doesn’t need a lot of watering, unless your soil dries out some 3 or 4 inches deep.");
        Plant kale = new Plant("Kale", 45, "24-26", "Full", -63, "./img/kale_photo.jpg", "Space kale 18 to 24 inches apart in an area with full sun and well-drained, fertile soil with a pH of 6.5 to 6.8. Kale is a fast grower, so keep the soil moist by giving it 1 to 1.5 inches of water each week.");
        Plant kohlrabi = new Plant("Kohlrabi", 43, "12-18", "Full", -999, "./img/kohlrabi_photo.jpg", "Kohlrabi needs at least 6 hours of full sun each day; more is better. Give it fertile, well-drained, moist soil with plenty of rich organic matter. A soil pH between 6.5 and 6.8 discourages clubroot disease.");
        Plant leeks = new Plant("Leeks", 105, "24", "Full", -63, "./img/leeks_photo.jpg", "Leeks aren’t fussy, but they do require moist soil, so check soil moisture often. One week after planting, begin regularly feeding with a water-soluble plant food. Harvest leeks at any time once they are large enough to eat.");
        Plant bibb_lettuce = new Plant("Bibb Lettuce", 75, "9-15", "Full or Part", -63, "./img/bibb_lettuce_photo.jpg", "Like other lettuces, the trick to growing Bibb lettuce is to grow it quickly. The soil should be rich, fertile, and well-draining. Keep the soil moist. Frequent use of nitrogen-rich fertilizer is recommended.");
        Plant mustard_greens = new Plant("Mustard Greens", 50, "8-12", "Full", -21, "./img/mustard_greens_photo.jpg", "Check soil moisture regularly and water when the top inch of soil becomes dry. After planting, encourage excellent leaf production by regularly feeding plants with a water-soluble plant food. Harvest mustard greens when leaves are large enough to eat.");
        Plant okra = new Plant("Okra", 63, "60-84", "Full", -999, "./img/okra_photo.jpg", "Okra will grow in many soil types. Once the plants start to grow, thin them so they are spaced 12 to 18 inches apart. Okra thrives in the full, hot sun. Regular watering is needed and is critical during flowering and pod development.");
        Plant onions = new Plant("Onions", 110, "24-30", "Full", -999, "./img/onions_photo.jpg", "In the garden, onion plants should be spaced 4 to 6 inches apart in the row, with rows 1 to 2 feet apart. Plant each one about 1/2 inch deep in a small hole. After planting, trim the tops to about 4 inches. Onions need about 1 inch of water per week.");
        Plant parsley = new Plant("Parsley", 75, "18", "Full or Part", -63, "./img/parsley_photo.jpg", "Keep the soil moist by watering regularly during prolonged dry periods; dry soils can cause the plants to ‘bolt’ (going to seed prematurely). Parsley is a hungry plant, so use a liquid plant food throughout summer.");
        Plant parsnips = new Plant("Parsnips", 105, "10-15", "Full", -999, "./img/parsnips_photo.jpg", "Parsnips need a fair amount of moisture to form healthy roots. Water during the summer if rainfall is less than 1 inch per week. As long as you started with good soil, fertilizing is likely not necessary.");
        Plant peanuts = new Plant("Peanuts", 120, "12-18", "Full", -999, "./img/peanuts_photo.jpg", "Peanuts need full sun for at least eight hours per day. Peanuts grow best in loose, well-drained, sandy loam. Peanuts need about 1 inch of rain or irrigation per week during the growing season.");
        Plant sugar_snap_peas = new Plant("Sugar Snap Peas", 70, "48-72", "Full", -999, "./img/sugar_snap_peas_photo.jpg", "Peas need about an inch of water a week. When watering, avoid wetting the foliage if possible to avoid disease. Peas will reach maturity in 50 – 70 days depending on the variety and growing conditions.");
        Plant cayenne_peppers = new Plant("Cayenne Peppers", 68, "24-36", "Full", -63, "./img/cayenne_peppers_photo.jpg", "Watering cayenne pepper plants can be a delicate process. If the soil becomes either too dry or too saturated, the plant’s foliage can turn yellow. A deep watering every few days at the base of the plant is generally beneficial.");
        Plant bell_peppers = new Plant("Bell Peppers", 70, "32-36", "Full", -63, "./img/bell_peppers_photo.jpg", "Peppers grow in all types of soils but do best in heavier, well-drained soils. Plant them in areas that receive at least 6 hours of sunlight each day.");
        Plant potatoes = new Plant("Potatoes", 62, "38", "Full", -999, "./img/potatoes_photo.jpg", "Keep potatoes evenly moist but not wet; water before the soil dries out. Potato tubers will rot if the soil is too wet. Even soil moisture is important; fluctuations in soil moisture—wet, dry, wet—can lead to cracked or knobby tubers.");
        Plant raab = new Plant("Raab", 55, "24-36", "Full", -28, "./img/raab_photo.jpg", "Broccoli rabe enjoys moderate water, so keep the soil evenly moist as it grows. Allow the soil to dry between watering to prevent overwatering which can lead to root rot.");
        Plant radicchio = new Plant("Radicchio", 90, "6", "Full", -17, "./img/radicchio_photo.jpg", "Radicchio needs consistent water during its growing season; one to one-and-a-half inches of water per week is ideal.");
        Plant radishes = new Plant("Radishes", 30, "6-7", "Full", -999, "./img/radishes_photo.jpg", "Sow radish seeds one inch apart in rows one foot apart in loosened soil. Cover them 1/2 to 1-inch deep and water them gently.");
        Plant rutabagas = new Plant("Rutabagas", 90, "12-14", "Full", -999, "./img/rutabagas_photo.jpg", "Rutabagas require a longer growing season, but need to mature in cool weather, so you should plant them from late May to early June for a fall crop. Plant seeds one to two inches apart in rows 18 to 30 inches apart.");
        Plant scallions = new Plant("Scallions", 60, "24-30", "Full", -999, "./img/scallions_photo.jpg", "Scallions need rich, well-draining soil. In addition, their shallow root systems require constant moisture and weed protection.");
        Plant spinach = new Plant("Spinach", 37, "10-12", "Full", 0, "./img/spinach_photo.jpg", "Water spinach to keep soil constantly moist. Use row covers to maintain cool soil and deter pests. When seedlings sprout to about 2 inches, thin them to 3-4 inches apart.");
        Plant zucchini = new Plant("Zucchini", 50, "12", "Full", -999, "./img/zucchini_photo.jpg", "Space plants 2 to 4 feet apart to provide air circulation and discourage disease. A good planting strategy is to plant zucchini on low hills that easily warm in spring.");
        Plant pumpkin = new Plant("Pumpkin", 110, "12-18", "Full", -999, "./img/pumpkin_photo.jpg", "Grow each pumpkin on a 3-foot wide mound of warm, fertile soil that has a pH of 6.0 to 6.8. Pumpkins require a lot of water, so it’s best to use a soaker hose or drip irrigation.");
        Plant acorn_squash = new Plant("Acorn Squash", 80, "10-12", "Full", -999, "./img/acorn_squash_photo.jpg", "Make sure your soil is rich and you feed them regularly with a good all-purpose fertilizer. Add plenty of sun, a soil pH of 5.5-6.8, and 70-90 days before the first fall frost.");
        Plant beefsteak_tomato = new Plant("Beefsteak Tomato", 85, "36-42", "Full", -49, "./img/beefsteak_tomato_photo.jpg", "Beefsteak tomatoes and all other types of tomatoes require well-drained, nutrient-rich soil to be able to flourish. A slightly acidic soil is best. Soil pH should be about 6.2 to 6.8.");
        Plant turnips = new Plant("Turnips", 55, "12-15", "Full", -999, "./img/turnips_photo.jpg", "Turnips do not need much care, but consistent soil moisture is important. Water regularly to keep soil lightly moist, One inch per week should prevent roots from becoming tough and bitter.");
        Plant watermelon = new Plant("Watermelon", 90, "7", "Full", -999, "./img/watermelon_photo.jpg", "Watermelons do not need a particularly large amount of water at planting times, though they benefit from a thorough drenching of 1 to 2 inches of water every week. Make sure the soil is wet to a depth of 6 inches every time you water.");
        Plant strawberry = new Plant("Strawberry", 160, "12", "Full", -80, "./img/strawberry_photo.jpg", "Give 1 to 1.5 inches of water weekly, and avoid wetting the leaves. Promote excellent fruit production by keeping plants fed with a continuous-release fertilizer. Harvest ripe strawberries in the cool of morning and refrigerate.");
        Plant blueberry = new Plant("Blueberry", 720, "60-84", "Full", -49, "./img/blueberry_photo.jpg", "Water blueberry plants during the day. Keep the soil moist but not soggy. Give them at least 1 inch per week during growing season and up to 4 inches per week during fruit ripening.");
        Plant cantaloupe = new Plant("Cantaloupe", 70, "12", "Full", -28, "./img/cantaloupe_photo.jpg", "Cantaloupes need a lot of water, so keep soil moist and avoid wetting the leaves—soaker hoses and drip irrigation are best. Mulch well and eliminate weeds early so vines can run freely.");
        Plant honeydew_mellon = new Plant("Honeydew Mellon", 76, "12", "Full", -28, "./img/honeydew_mellon_photo.jpg", "Honeydews have a shallow root system. Keep plants well-watered during the growing season, especially during dry spells. Plants need about 1-2 inches of rain per week during the growing season.");
        Plant blackberry = new Plant("Blackberry", 720, "60-72", "Full", -42, "./img/blackberry_photo.jpg", "Water blackberries plants during the day. Then, give them about 1-2 inches per week during growing season and up to 4 inches per week during harvest.");
        Plant rosemary = new Plant("Rosemary", 100, "24-36", "Full", -70, "./img/rosemary_photo.jpg", "When growing rosemary plants, provide them with well-drained, sandy soil and at least six to eight hours of sunlight.");
        Plant mint = new Plant("Mint", 50, "24-36", "Full", -63, "./img/mint_photo.jpg", "Indoor mint prefers fairly moist soil. In between thorough waterings allow the top inch (2.5 cm.) or so to become dry and then water again.");
        Plant thyme = new Plant("Thyme", 190, "6-12", "Full", -49, "./img/thyme_photo.jpg", "Thyme needs a warm, sunny position. The more sun it receives, the stronger the flavors. It is fairly drought tolerant and needs a well-drained, preferably alkaline, soil.");
        Plant sunflower = new Plant("Sunflower", 84, "30-72", "Full", -999, "./img/sunflower_photo.jpg", "To grow sunflowers you need a sunny, sheltered spot and a good soil – add plenty of well-rotted manure or garden compost before planting. Protect the young plants from slugs and snails and water your sunflowers regularly.");
        Plant chamomile = new Plant("Chamomile", 105, "24-36", "Full", -49, "./img/chamomile_photo.jpg", "Chamomile is a fairly adaptable plant, but does best in full sun in well-drained soil. Water well in dry weather, and deadhead thoroughly to prevent self-sowing. Otherwise, leave half the flowers unharvested and self-sowing is likely.");
        Plant lavender = new Plant("Lavender", 75, "24-48", "Full", -56, "./img/lavender_photo.jpg", "Lavender prefers full sun and well drained, fertile soil. Trim plants back hard in spring, just as new growth starts – but never prune back into the woody part of the stems. This will give a rush of even growth for the first leaves and bloom.");


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
        plantRepo.save(strawberry);
        plantRepo.save(blueberry);
        plantRepo.save(cantaloupe);
        plantRepo.save(honeydew_mellon);
        plantRepo.save(blackberry);
        plantRepo.save(rosemary);
        plantRepo.save(mint);
        plantRepo.save(thyme);
        plantRepo.save(sunflower);
        plantRepo.save(chamomile);
        plantRepo.save(lavender);


    }


}
