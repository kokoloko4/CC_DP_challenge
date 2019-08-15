package Inventory;

import Utils.Utils;

import java.util.Queue;

public class Milk extends Product {

    public Milk(String flavor, String price, String quantity, Queue<Item> items){
        super.flavor = flavor;
        super.price = price;
        super.quantity = quantity;
        super.items = items;
        super.addItems(Utils.generateItemsList(Integer.valueOf(quantity)));
    }
}
