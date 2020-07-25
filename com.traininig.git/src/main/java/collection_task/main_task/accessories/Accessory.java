package collection_task.main_task.accessories;

import collection_task.main_task.FloristHelper;
import collection_task.main_task.accessories.accessories_attributes.*;


import java.util.Objects;

public class Accessory {
    private AccessoryTypes accessoryType;
    private AccessoryMaterial accessoryMaterial;
    private AccessoryColors accessoryColor;

    public Accessory(AccessoryTypes accessoryType, AccessoryMaterial accessoryMaterial, AccessoryColors accessoryColor) {
        this.accessoryType = accessoryType;
        this.accessoryMaterial = accessoryMaterial;
        this.accessoryColor = accessoryColor;
    }

    public AccessoryTypes getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(AccessoryTypes accessoryType) {
        this.accessoryType = accessoryType;
    }

    public AccessoryMaterial getAccessoryMaterial() {
        return accessoryMaterial;
    }

    public void setAccessoryMaterial(AccessoryMaterial accessoryMaterial) {
        this.accessoryMaterial = accessoryMaterial;
    }

    public AccessoryColors getAccessoryColor() {
        return accessoryColor;
    }

    public void setAccessoryColor(AccessoryColors accessoryColor) {
        this.accessoryColor = accessoryColor;
    }

    public int getAccessoriesCost() {
        return accessoryType.getAccessoryCost() + (int) (accessoryType.getAccessoryCost() * accessoryMaterial.getPriceСoefficient());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accessory accessory = (Accessory) o;
        return accessoryType == accessory.accessoryType &&
                accessoryMaterial == accessory.accessoryMaterial &&
                accessoryColor == accessory.accessoryColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryType, accessoryMaterial, accessoryColor);
    }

    @Override
    public String toString() {
        return
                "AccessoryType: " + accessoryType +
                        ", material: " + accessoryMaterial +
                        ", color: " + accessoryColor +
                        ", cost: " + FloristHelper.convertCoinsToBin(getAccessoriesCost());
    }
}
