package collection_task.main_task.flowers;

import collection_task.main_task.flowers.flower_attributes.FlowerColors;
import collection_task.main_task.flowers.flower_attributes.FlowerFreshness;
import collection_task.main_task.flowers.flower_attributes.FlowerStemLength;

import java.util.Objects;

public abstract class Flower implements Comparable<Flower>{
    private FlowerColors color;
    private FlowerFreshness freshness;
    private FlowerStemLength stemLength;

    public Flower() {
    }

    public Flower(FlowerColors color, FlowerFreshness freshness, FlowerStemLength stemLength) {
        this.color = color;
        this.freshness = freshness;
        this.stemLength = stemLength;
    }

    public FlowerColors getColor() {
        return color;
    }

    public void setColor(FlowerColors color) {
        this.color = color;
    }

    public FlowerFreshness getFreshness() {
        return freshness;
    }

    public void setFreshness(FlowerFreshness freshness) {
        this.freshness = freshness;
    }

    public FlowerStemLength getStemLength() {
        return stemLength;
    }

    public void setStemLength(FlowerStemLength stemLength) {
        this.stemLength = stemLength;
    }

    public abstract int getCost();

    public String fieldsToString() {
        return "color: " + color +
                ", freshness: " + freshness +
                ", stem length: " + stemLength;
    }

    @Override
    public String toString() {
        return fieldsToString();
    }

    @Override
    public int compareTo(Flower o) {
        return freshness.getFreshnessValue() - o.freshness.getFreshnessValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return color == flower.color &&
                freshness == flower.freshness &&
                stemLength == flower.stemLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, freshness, stemLength);
    }
}
