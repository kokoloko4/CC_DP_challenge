package Store;

import Inventory.Product;
import People.Person;
import java.util.List;

public class Store {

    private static Store store;

    private List<Person> employees;
    private String name;
    private List<Product> productsList;

    private Store(List<Person> employees, String name, List<Product> productsList) {
        this.employees = employees;
        this.name = name;
        this.productsList = productsList;
    }

    public List<Person> getEmployees() {
        return employees;
    }

    public List<Product> getProductsList(){
        return this.productsList;
    }

    public static Store getStore(List<Person> employees, String nombre, List<Product> productsList){
        if (store == null)
        {
            synchronized (Store.class)
            {
                if (store==null)
                    store = new Store(employees, nombre, productsList);
            }
        }
        return store;
    }

    public void openStore(){
        System.out.println(this.name + " is open");
    }

    public void closeStore(){
        System.out.println("Closing store");
    }

}

