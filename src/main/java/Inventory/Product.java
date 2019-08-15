package Inventory;

import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Product{

    protected String productName;
    protected String price;
    protected String quantity;
    protected Queue<Item> items;

    /**
     * @return Price of the product
     */
    public double getPrice(){
        return Double.valueOf(this.price);
    }

    /**
     * @return Removes a item from the queue and returns the removed item
     */
    public Item removeItem (){
        this.quantity = Integer.toString(Integer.valueOf(this.quantity)-1);
        return items.poll();
    }

    /**
     * @param items_to_add List of items to add.
     */
    public void addItems(List<Item> items_to_add){
        this.items.addAll(items_to_add);
    }

    /**
     * @return String with product information
     */
    @Override
    public String toString() {
        return String.format("\n Name: %s\t Price: %s \t Quantity: %s", this.productName, this.price, this.quantity);
    }

    /**
     * @param object Compare a product's name
     * @return True if the products are equal or false in opposite case
     */
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        return (this.toString().equalsIgnoreCase(other.toString()));
    }
}
