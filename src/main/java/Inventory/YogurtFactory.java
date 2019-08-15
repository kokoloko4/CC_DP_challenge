package Inventory;

import java.util.LinkedList;

public class YogurtFactory extends  ProductFactory {
    @Override
    public Product createVanillaProduct() {
        return new Yogurt("Vanilla Yogurt", "7.0", "38", new LinkedList<Item>());
    }

    @Override
    public Product createChocolateProduct() {
        return new Yogurt("Chocolate Yogurt", "7.0", "26", new LinkedList<Item>());
    }

    @Override
    public Product createStrawBerryProduct() {
        return new Yogurt("Strawberry Yogurt", "7.0", "21", new LinkedList<Item>());
    }
}
