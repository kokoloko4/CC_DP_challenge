package Inventory;

import Utils.Utils;

import java.util.Queue;

public class Yogurt extends Product{
    public Yogurt(String productName, String price, String quantity, Queue<Item> items){
        super.productName = productName;
        super.price = price;
        super.quantity = quantity;
        super.items = items;
        super.addItems(Utils.generateItemsList(Integer.valueOf(quantity), super.productName, super.price));
    }
}
