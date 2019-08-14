package Store;

import java.util.List;
import java.util.Queue;

public class Product{
    public String name;
    public String price;
    public String quantity;
    public Queue<Item> items;

    public Product(String name, String price, String quantity, Queue<Item> items) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.items = items;
    }

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
        return String.format("\n Name: %s\n Price: %s \n Quantity: %s", this.name, this.price, this.quantity);
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
