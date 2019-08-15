package Inventory;

import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public abstract class Product{

    protected String flavor;
    protected String price;
    protected String quantity;
    protected Queue<Item> items;

    public double getPrice(){
        return Double.valueOf(this.price);
    }

    public Item removeItem (){
        this.quantity = Integer.toString(Integer.valueOf(this.quantity)-1);
        return items.poll();
    }

    public void addItems(List<Item> items_to_add){
        this.items.addAll(items_to_add);
    }

    @Override
    public String toString() {
        return String.format("\n Flavor: %s\n Price: %s \n Quantity: %s", this.flavor, this.price, this.quantity);
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        return (this.toString().equalsIgnoreCase(other.toString()));
    }
}
