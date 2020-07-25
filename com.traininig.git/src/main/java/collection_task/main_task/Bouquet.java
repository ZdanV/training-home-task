package collection_task.main_task;

import collection_task.main_task.accessories.Accessory;
import collection_task.main_task.flowers.Flower;
import collection_task.main_task.flowers.flower_attributes.FlowerStemLength;

import java.util.List;

public class Bouquet {
    private List<Flower> flowers;
    private Accessory accessory;

    public Bouquet(List<Flower> flowers, Accessory accessory) {
        this.flowers = flowers;
        this.accessory = accessory;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public int getFlowersCost() {
        int flowersCost = 0;
        for (Flower flower : flowers) {
            flowersCost += flower.getCost();
        }
        return flowersCost;
    }

    public int getBouquetCost() {
        return getFlowersCost() + accessory.getAccessoriesCost();
    }

    public void printFlowers() {
        System.out.println("Flowers in bouquet:");
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        System.out.println();
    }

    private String getFlowersAsString() {
        StringBuilder builder = new StringBuilder();
        for (Flower flower : flowers) {
            builder.append(flower + "\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "Bouquet: \n" +
                "Flowers in bouquet: \n" + getFlowersAsString() +
                "Bouquet accessory: " + accessory +
                "\nTotal cost: " + FloristHelper.convertCoinsToBin(getBouquetCost()) +
                "\n";
    }

    public void getFlowerByLength(FlowerStemLength veryLong) {
    }
}
