package collection_task.main_task.accessories.accessories_attributes;

public enum AccessoryColors {
    RED,
    WHITE,
    GRAY,
    PINK,
    BLUE,
    BLACK;

    public String getColor() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getColor();
    }
}
