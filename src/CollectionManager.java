import java.util.ArrayList;

public class CollectionManager {
    private String managerID;
    private ArrayList<CollectionPoint> managedPoints;

    public CollectionManager(String managerID) {
        this.managerID = managerID;
        this.managedPoints = new ArrayList<>();
    }
    public void addPoint(CollectionPoint point) {
        managedPoints.add(point);
    }

    public void assignVehicleForCollection(CollectionPoint targetPoint, RecyclingVehicle vehicle) {
        // retrieve items from target point collect all items
        ArrayList<RecyclableItem> collectedItems = targetPoint.collectAllItems();

        if(collectedItems.isEmpty() || collectedItems == null) {
            System.out.println("The Collection Point does not have any items to be collected.");
        } else {
            // call loadcollecteditems
            vehicle.loadCollectedItems(collectedItems);
        }
    }
}
