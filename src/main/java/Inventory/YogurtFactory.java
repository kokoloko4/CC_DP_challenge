package Inventory;

import java.util.LinkedList;

public class YogurtFactory extends  ProductFactory {
    /**
     * @return Creates a vanilla yogurt
     */
    @Override
    public Product createVanillaProduct() {
        return new Yogurt("Vanilla Yogurt", "7.0", "38", new LinkedList<Item>());
    }

    /**
     * @return Creates a chocolate yogurt
     */
    @Override
    public Product createChocolateProduct() {
        return new Yogurt("Chocolate Yogurt", "7.0", "26", new LinkedList<Item>());
    }

    /**
     * @return Creates a strawberry yogurt
     */
    @Override
    public Product createStrawBerryProduct() {
        return new Yogurt("Strawberry Yogurt", "7.0", "21", new LinkedList<Item>());
    }
}
