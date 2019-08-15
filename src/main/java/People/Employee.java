package People;

import Inventory.Product;
import Store.Store;
import Utils.Utils;

public class Employee extends Person {

    public Employee() {
        super.name = Utils.generateName();
        super.address = Utils.generateAddress();
        super.id = Utils.generateId();
        super.phone = Utils.generatePhone();
    }

    public void sell(Product product, Client client, Store store){
        double price = 0;
        for (int i=0; i< store.getProductsList().size(); i++){
            if(product.equals(store.getProductsList().get(i))){
                price = store.getProductsList().get(i).getPrice();
                client.budget = client.budget - price;
                client.itemsPurchased.add(store.getProductsList().get(i));
                store.getProductsList().get(i).removeItem();
            }
        }
        if (price==0){
            System.out.println("That product isn't exists on this store");
        }
    }
}
