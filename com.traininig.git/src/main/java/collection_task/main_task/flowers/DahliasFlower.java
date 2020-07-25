package collection_task.main_task.flowers;

import collection_task.main_task.FloristHelper;
import collection_task.main_task.flowers.flower_attributes.FlowerColors;
import collection_task.main_task.flowers.flower_attributes.FlowerFreshness;
import collection_task.main_task.flowers.flower_attributes.FlowerStemLength;

import java.util.Objects;

public class DahliasFlower extends Flower{
    private final String flowerName = "Dahlias";
    private final int flowerCost = 400;

    public DahliasFlower() {
    }

    public DahliasFlower(FlowerColors color, FlowerFreshness freshness, FlowerStemLength stemLength) {
        super(color, freshness, stemLength);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getFlowerCost() {
        return flowerCost;
    }

    @Override
    public int getCost() {
        return flowerCost;
    }

    @Override
    public String toString() {
        return "Flower name: " + flowerName + ", " + super.toString() +
                ", flower cost: " + FloristHelper.convertCoinsToBin(flowerCost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DahliasFlower that = (DahliasFlower) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowerName, flowerCost);
    }
}
