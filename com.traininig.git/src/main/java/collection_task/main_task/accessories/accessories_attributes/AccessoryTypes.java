package collection_task.main_task.accessories.accessories_attributes;

public enum AccessoryTypes {
    BOX(200),
    WRAPPER(100),
    TAPE(80);

    int accessoryCost;

    AccessoryTypes(int accessoryCost) {
        this.accessoryCost = accessoryCost;
    }

    public int getAccessoryCost() {
        return accessoryCost;
    }

    public String getAccessoryName() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return getAccessoryName();
    }
}
