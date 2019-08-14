package People;

import People.Person;
import Store.Item;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    public double budget;
    public BigInteger age;
    public List<Item> itemsPurchased;

    public Client(double budget, BigInteger age) {
        super.name = Person.generateName();
        super.address = Person.generateAddress();
        super.id = Person.generateId();
        super.phone = Person.generatePhone();
        this.budget = budget;
        this.age = age;
        this.itemsPurchased = new ArrayList<>();
    }

    public void buy(){

    }
}
