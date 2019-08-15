package Inventory;

import java.util.LinkedList;

public class CookieFactory extends ProductFactory {

    @Override
    public Product createVanillaProduct() {
        return new Cookie("Vanilla Cookie", "1.5", "24", new LinkedList<Item>());
    }

    @Override
    public Product createChocolateProduct() {
        return new Cookie("Chocolate Cookie", "2.0", "17", new LinkedList<Item>());
    }

    @Override
    public Product createStrawBerryProduct() {
        return new Cookie("Strawberry Cookie", "3.0", "22", new LinkedList<Item>());
    }
}
