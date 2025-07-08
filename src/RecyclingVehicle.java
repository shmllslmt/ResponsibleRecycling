import java.util.ArrayList;

public class RecyclingVehicle {
    private String vehicleID;
    private double currentLoadInKG;
    private double capacityInKG;

    public RecyclingVehicle(String vehicleID, double currentLoadInKG, double capacityInKG) {
        this.vehicleID = vehicleID;
        this.currentLoadInKG = currentLoadInKG;
        this.capacityInKG = capacityInKG;
    }

    public void loadCollectedItems(ArrayList<RecyclableItem> items) {
        if(items.isEmpty() || items == null) {
            System.out.println("No items is loaded.");
            return;
        }
        double loadWeight = items.stream().mapToDouble(RecyclableItem::getWeightInKG).sum();

//        double tempLoadWeight = 0.0;
//        for(RecyclableItem i: items) {
//            tempLoadWeight += i.getWeightInKG();
//        }

        if(currentLoadInKG + loadWeight <= capacityInKG) {
            currentLoadInKG += loadWeight;
            System.out.println("Successfully collect the items. Current load is "+currentLoadInKG+"kg.");
        } else {
            System.out.println("Unsuccessful to collect the items due to over capacity!");
        }
    }
}
