package People;

import Inventory.Item;
import Utils.Utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    public double budget;
    public BigInteger age;
    public List<Item> itemsPurchased;

    public Client(double budget, BigInteger age) {
        super.name = Utils.generateName();
        super.address = Utils.generateAddress();
        super.id = Utils.generateId();
        super.phone = Utils.generatePhone();
        this.budget = budget;
        this.age = age;
        this.itemsPurchased = new ArrayList<>();
    }

    public void buy(){

    }
}
