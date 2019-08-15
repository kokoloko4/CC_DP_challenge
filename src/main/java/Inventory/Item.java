package Inventory;

public class Item {
    public int id;
    public String name;
    public String price;

    /**
     * @param id Id's product
     * @param name Name's product
     * @param price Price's product
     */
    public Item(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * @return Returns of product's information
     */
    @Override
    public String toString() {
        return String.format("\tId: %d\t Name: %s\t Price: %s\n", this.id, this.name, this.price);
    }
}
