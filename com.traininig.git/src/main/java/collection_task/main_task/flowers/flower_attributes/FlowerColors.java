package collection_task.main_task.flowers.flower_attributes;

public enum FlowerColors {
    RED,
    WHITE,
    YELLOW,
    ORANGE,
    PINK,
    BLUE;

    public String getColorName() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getColorName();
    }
}
