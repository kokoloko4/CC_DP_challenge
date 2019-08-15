package People;

import Inventory.Item;
import Utils.Utils;
import javafx.util.Builder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Client extends Person{

    private double budget;
    private BigInteger age;
    private List<Item> itemsPurchased;

    /**
     * @param builder Creates a new client with a builder
     */
    private Client(ClientBuilder builder) {
        super(builder.name, builder.id, builder.address, builder.phone);
        this.budget = builder.budget;
        this.age = builder.age;
        this.itemsPurchased = builder.itemsPurchased;
    }

    /**
     * @return Returns client's name
     */
    public String getName() {
        return super.name;
    }

    /**
     * @return Returns client's budget
     */
    public double getBudget() {
        return budget;
    }

    /**
     * @param budget Set the budget of the client
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * @return Get the items purchased by a client
     */
    public List<Item> getItemsPurchased() {
        return itemsPurchased;
    }

    /**
     *  Shows a bill of a client with all the products that bought
     */
    public void obtainBill(){
        if (!this.itemsPurchased.isEmpty()){
            System.out.println("\t************"+ this.getName()+"'s bill************");
            for (int j = 0 ; j < this.itemsPurchased.size() ; j++){
                System.out.print(this.itemsPurchased.get(j));
            }
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

        /**
         *  Constructor of ClientBuilder
         */
        public ClientBuilder() {
            this.name = Utils.generateName();
            this.id = Utils.generateId();
            this.address = Utils.generateAddress();
            this.phone = Utils.generatePhone();
        }

        /**
         * @param budget Set the budget of a client
         * @return ClientBuilder
         */
        public ClientBuilder setBudget(double budget) {
            this.budget = budget;
            return this;
        }

        /**
         * @param age The age of the client
         * @return ClientBuilder
         */
        public ClientBuilder setAge(BigInteger age) {
            this.age = age;
            return this;
        }

        /**
         * @return Set items purchased to client builder
         */
        public ClientBuilder setItemsPurchased() {
            this.itemsPurchased = new ArrayList<>();
            return this;
        }

        /**
         * @return A new client is built
         */
        public Person build() {
            return new Client(this);
        }
    }
}
