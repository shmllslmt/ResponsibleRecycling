public class RecyclableItem {
    private String itemID;
    private String materialType;
    private double weightInKG;

    public RecyclableItem(String itemID, String materialType, double weightInKG) {
        this.itemID = itemID;
        this.materialType = materialType;
        this.weightInKG = weightInKG;
    }

    @Override
    public String toString() {
        return  "ItemID = " + itemID + '\n' +
                "Material Type = " + materialType + '\n' +
                "Weight (kg) = " + weightInKG;
    }

    public String getItemID() {
        return itemID;
    }

    public String getMaterialType() {
        return materialType;
    }

    public double getWeightInKG() {
        return weightInKG;
    }
}
