package People;

import Inventory.Item;
import Inventory.Product;
import Store.Store;
import Utils.Utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Person {

    protected String name;
    protected String id;
    protected String address;
    protected String phone;

    private double budget;
    private BigInteger age;
    private List<Item> itemsPurchased;

    /**
     *
     * @param builder
     */
    private Person(EmployeeBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    private Person(ClientBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.address = builder.address;
        this.phone = builder.phone;
        this.budget = builder.budget;
        this.age = builder.age;
        this.itemsPurchased = builder.itemsPurchased;
    }

    public String getName() {
        return name;
    }

    public void obtainBill(){
        if (!this.itemsPurchased.isEmpty()){
            System.out.println("\t************"+ this.getName()+"'s bill************");
            for (int j = 0 ; j < this.itemsPurchased.size() ; j++){
                System.out.print(this.itemsPurchased.get(j));
            }
        }
    }

    public void sell(Product product, Person client, Store store){
        double price = 0;
        for (int i=0; i< store.getProductsList().size(); i++){
            if(product.equals(store.getProductsList().get(i))){
                price = store.getProductsList().get(i).getPrice();
                client.budget = client.budget - price;
                client.itemsPurchased.add(store.getProductsList().get(i).removeItem());
            }
        }
        if (price==0){
            System.out.println("That product isn't exists on this store");
        }
    }

    public static class EmployeeBuilder {
        private String name;
        private String id;
        private String address;
        private String phone;

        public EmployeeBuilder() {
            this.name = Utils.generateName();
            this.id = Utils.generateId();
            this.address = Utils.generateAddress();
            this.phone = Utils.generatePhone();
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static class ClientBuilder {
        private String name;
        private String id;
        private String address;
        private String phone;

        private double budget;
        private BigInteger age;
        private List<Item> itemsPurchased;

        public ClientBuilder() {
            this.name = Utils.generateName();
            this.id = Utils.generateId();
            this.address = Utils.generateAddress();
            this.phone = Utils.generatePhone();
        }

        public ClientBuilder setBudget(double budget) {
            this.budget = budget;
            return this;
        }

        public ClientBuilder setAge(BigInteger age) {
            this.age = age;
            return this;
        }

        public ClientBuilder setItemsPurchased() {
            this.itemsPurchased = new ArrayList<>();
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
