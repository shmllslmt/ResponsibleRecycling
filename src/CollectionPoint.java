import java.util.ArrayList;

public class CollectionPoint {
    private String pointID;
    private String location;
    private ArrayList<RecyclableItem> collectedItems;

    public CollectionPoint(String pointID, String location) {
        this.pointID = pointID;
        this.location = location;
        this.collectedItems = new ArrayList<>();
    }
    public void depositItem(RecyclableItem item) {
        boolean success = collectedItems.add(item);
        if(success) {
            System.out.println(item);
            System.out.println("Successfully added to the Collection Point.");
        } else
            System.out.println("Item cannot be added to the Collection Point.");
    }
    public ArrayList<RecyclableItem> collectAllItems() {
        // Deep Copy
        ArrayList<RecyclableItem> temp = new ArrayList<>();
        for(RecyclableItem item: collectedItems) {
            temp.add(item);
        }
        collectedItems.clear();
        return temp;
    }
}
