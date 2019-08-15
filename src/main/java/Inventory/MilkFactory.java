package Inventory;

import java.util.LinkedList;

public class MilkFactory extends  ProductFactory{
    @Override
    public Product createVanillaProduct() {
        return new Milk("Vanilla", "3.6", "22", new LinkedList<Item>());
    }

    @Override
    public Product createChocolateProduct() {
        return new Milk("Chocolate",  "3.1", "54", new LinkedList<Item>());
    }
}
