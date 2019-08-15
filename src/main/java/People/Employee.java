package People;

import Inventory.Product;
import Store.Store;
import Utils.Utils;

public class Employee extends Person{

    /**
     * @param builder Build a employee with the builder
     */
    private Employee(EmployeeBuilder builder) {
        super(builder.name, builder.id, builder.address, builder.phone);
    }

    /**
     * @param product Product to sell
     * @param client Client that bought the product
     * @param store Store where is the produtc
     */
    public void sell(Product product, Client client, Store store){
        double price = 0;
        for (int i=0; i< store.getProductsList().size(); i++){
            if(product.equals(store.getProductsList().get(i))){
                price = store.getProductsList().get(i).getPrice();
                client.setBudget(client.getBudget() - price);
                client.getItemsPurchased().add(store.getProductsList().get(i).removeItem());
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

        /**
         *  Constructor of EmployeeBuilder
         */
        public EmployeeBuilder() {
            this.name = Utils.generateName();
            this.id = Utils.generateId();
            this.address = Utils.generateAddress();
            this.phone = Utils.generatePhone();
        }

        /**
         * @return A employee is built
         */
        public Person build() {
            return new Employee(this);
        }
    }
}
