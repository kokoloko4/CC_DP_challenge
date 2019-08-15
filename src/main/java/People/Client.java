package People;

import Inventory.Item;
import Inventory.Product;
import Store.Store;
import Utils.Utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    public double budget;
    public BigInteger age;
    public List<Product> itemsPurchased;

    public Client(double budget, BigInteger age) {
        super.name = Utils.generateName();
        super.address = Utils.generateAddress();
        super.id = Utils.generateId();
        super.phone = Utils.generatePhone();
        this.budget = budget;
        this.age = age;
        this.itemsPurchased = new ArrayList<>();
    }

    public void obtainBill(Store store){
        if (!itemsPurchased.isEmpty()){
            System.out.println("Factura del cliente "+ super.getName());
            for (int j = 0 ; j < this.itemsPurchased.size() ; j++){
                System.out.println(this.itemsPurchased.get(j));
            }
        }
    }
}
