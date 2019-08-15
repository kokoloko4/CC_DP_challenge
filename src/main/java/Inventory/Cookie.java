package Inventory;

import Utils.Utils;

import java.util.Queue;

public class Cookie extends Product {

    public Cookie(String productName, String price, String quantity, Queue<Item> items){
        super.productName = productName;
        super.price = price;
        super.quantity = quantity;
        super.items = items;
        super.addItems(Utils.generateItemsList(Integer.valueOf(quantity), super.productName, super.price));
    }

}
