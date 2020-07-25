package collection_task.main_task.flowers.flower_attributes;

public enum FlowerFreshness {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int freshnessValue;

    FlowerFreshness(int freshnessValue) {
        this.freshnessValue = freshnessValue;
    }

    public int getFreshnessValue() {
        return freshnessValue;
    }

    public String getFreshness() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getFreshness();
    }
}
