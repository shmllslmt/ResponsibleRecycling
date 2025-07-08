public class Main {
    public static void main(String[] args) {
        RecyclableItem item1 = new RecyclableItem("001", "Cloth", 10);
        RecyclableItem item2 = new RecyclableItem("002", "Plastic", 20);
        RecyclableItem item3 = new RecyclableItem("003", "Paper", 30);

        CollectionPoint tmnU = new CollectionPoint("CP1", "Taman University");

        tmnU.depositItem(item1);
        tmnU.depositItem(item2);
        tmnU.depositItem(item3);

        RecyclingVehicle kelisa = new RecyclingVehicle("JGY4336", 50, 500);

        CollectionManager manager = new CollectionManager("MANAGER");

        manager.assignVehicleForCollection(tmnU, kelisa);

    }
}