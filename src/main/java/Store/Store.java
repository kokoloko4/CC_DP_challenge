package Store;

import Inventory.Product;
import People.Client;
import People.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {

    private static Store store;

    private List<Person> employees = new LinkedList<Person>();
    private String nombre;
    private List<Product> productsList;

    private Store(List<Person> employees, String nombre, List<Product> productsList) {
        this.employees = employees;
        this.nombre = nombre;
        this.productsList = productsList;
    }

    public List<Product> getProductsList(){
        return this.productsList;
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

    public void closeStore(){
        System.out.println("Closing store");
    }

}

