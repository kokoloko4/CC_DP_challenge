package Store;

import Inventory.Product;
import People.Client;
import People.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {

    private static Store store;

    public List<Person> employees = new LinkedList<Person>();
    public String nombre;
    public List<Product> productsList;

    private Store(List<Person> employees, String nombre, List<Product> productsList) {
        this.employees = employees;
        this.nombre = nombre;
        this.productsList = productsList;
    }

    public static Store getStore(List<Person> employees, String nombre, List<Product> productsList){
        if (store == null)
        {
            // To make thread safe
            synchronized (Store.class)
            {
                // check again as multiple threads
                // can reach above step
                if (store==null)
                    store = new Store(employees, nombre, productsList);
            }
        }
        return store;
    }

    public void openStore(){
        System.out.println("Store is open");
    }

    public void sell(Product product, Client client){
        double price = 0;
        for (int i=0; i<productsList.size(); i++){
            if(product.equals(productsList.get(i))){
                price = productsList.get(i).getPrice();
                client.budget = client.budget - price;
                client.itemsPurchased.add(productsList.get(i).removeItem());

            }
        }
        if (price==0){
            System.out.println("That product isn't exists on this store");
        }
    }

    public void closeStore(){
        System.out.println("Closing store");
    }

}

