package collection_task.main_task;

import collection_task.main_task.accessories.Accessory;
import collection_task.main_task.accessories.accessories_attributes.AccessoryColors;
import collection_task.main_task.accessories.accessories_attributes.AccessoryMaterial;
import collection_task.main_task.accessories.accessories_attributes.AccessoryTypes;
import collection_task.main_task.flowers.*;
import collection_task.main_task.flowers.flower_attributes.FlowerColors;
import collection_task.main_task.flowers.flower_attributes.FlowerFreshness;
import collection_task.main_task.flowers.flower_attributes.FlowerStemLength;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Flower> bouquetFlowers = Arrays.asList(
                new DahliasFlower(FlowerColors.ORANGE, FlowerFreshness.HIGH, FlowerStemLength.SHORT),
                new LilyFlower(FlowerColors.YELLOW, FlowerFreshness.LOW, FlowerStemLength.MEDIUM),
                new RoseFlower(FlowerColors.RED, FlowerFreshness.MEDIUM, FlowerStemLength.LONG),
                new PeonyFlower(FlowerColors.BLUE, FlowerFreshness.LOW, FlowerStemLength.VERY_LONG),
                new RoseFlower(FlowerColors.WHITE, FlowerFreshness.MEDIUM, FlowerStemLength.VERY_LONG)
        );
        Accessory bouquetAccessory = new Accessory(AccessoryTypes.BOX, AccessoryMaterial.PAPER, AccessoryColors.RED);
        Bouquet bouquet = new Bouquet(bouquetFlowers, bouquetAccessory);
        System.out.println(bouquet);
        Collections.sort(bouquetFlowers);
        System.out.println("Flowers sorted by freshness:");
        bouquet.printFlowers();
        FlowerStemLength desiredStemLength = FlowerStemLength.VERY_LONG;
        System.out.println("Flower of the corresponding length " + desiredStemLength + ": " + bouquet.getBouquetCost());
    }
}
