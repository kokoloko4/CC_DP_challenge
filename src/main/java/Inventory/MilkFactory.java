package Inventory;

import java.util.LinkedList;

public class MilkFactory extends  ProductFactory{
    /**
     * @return Creates a vanilla milk
     */
    @Override
    public Product createVanillaProduct() {
        return new Milk("Vanilla Milk", "3.6", "22", new LinkedList<Item>());
    }

    /**
     * @return Creates a chocolate milk
     */
    @Override
    public Product createChocolateProduct() {
        return new Milk("Chocolate Milk",  "3.1", "54", new LinkedList<Item>());
    }

    /**
     * @return Creates a strawberry milk
     */
    @Override
    public Product createStrawBerryProduct() {
        return new Milk("StrawBerry Milk",  "5.0", "27", new LinkedList<Item>());
    }
}
