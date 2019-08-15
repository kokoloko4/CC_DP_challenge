package Inventory;

public class Item {
    public int id;
    public String name;
    public String price;

    public Item(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\tId: %d\t Name: %s\t Price: %s\n", this.id, this.name, this.price);
    }
}
