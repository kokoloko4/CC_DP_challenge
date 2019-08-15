package Inventory;

import Utils.Utils;

import java.util.Queue;

public class Milk extends Product {

    public Milk(String productName, String price, String quantity, Queue<Item> items){
        super.productName = productName;
        super.price = price;
        super.quantity = quantity;
        super.items = items;
        super.addItems(Utils.generateItemsList(Integer.valueOf(quantity), super.productName, super.price));
    }
}
