package Inventory;

import Inventory.Product;

public abstract class ProductFactory {
    public abstract Product createVanillaProduct();
    public abstract Product createChocolateProduct();
}
