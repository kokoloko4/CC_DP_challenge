package Inventory;

import java.util.LinkedList;

public class CookieFactory extends ProductFactory {

    /**
     * @return Creates a vanilla cookie
     */
    @Override
    public Product createVanillaProduct() {
        return new Cookie("Vanilla Cookie", "1.5", "24", new LinkedList<Item>());
    }

    /**
     * @return Creates a chocolate cookie
     */
    @Override
    public Product createChocolateProduct() {
        return new Cookie("Chocolate Cookie", "2.0", "17", new LinkedList<Item>());
    }

    /**
     * @return Creates a strawberry cookie
     */
    @Override
    public Product createStrawBerryProduct() {
        return new Cookie("Strawberry Cookie", "3.0", "22", new LinkedList<Item>());
    }
}
