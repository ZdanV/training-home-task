package collection_task.main_task.accessories.accessories_attributes;

public enum AccessoryMaterial {
    PAPER(0.08),
    PLASTIC(0.04),
    TISSUE(0.06);

    private double priceСoefficient;

    AccessoryMaterial(double priceСoefficient) {
        this.priceСoefficient = priceСoefficient;
    }

    public double getPriceСoefficient() {
        return priceСoefficient;
    }

    public String getMaterialName() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getMaterialName();
    }
}

