package collection_task.main_task.flowers.flower_attributes;

public enum FlowerStemLength {
    SHORT(35),
    MEDIUM(45),
    LONG(55),
    VERY_LONG(65);

    private int lengthInCentimeters;

    FlowerStemLength(int lengthInCentimeters) {
        this.lengthInCentimeters = lengthInCentimeters;
    }

    public int getLengthInCentimeters() {
        return lengthInCentimeters;
    }

    public String getName() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getName() + "(" + lengthInCentimeters + "cm)";
    }
}
