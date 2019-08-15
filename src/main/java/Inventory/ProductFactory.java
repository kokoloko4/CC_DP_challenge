package Inventory;

import Inventory.Product;

/**
 *
 */
public abstract class ProductFactory {
    /**
     * @return Create a product of vanilla
     */
    public abstract Product createVanillaProduct();

    /**
     * @return Create a product of chocolate
     */
    public abstract Product createChocolateProduct();

    /**
     * @return Create a product of strawberry
     */
    public abstract  Product createStrawBerryProduct();
}
