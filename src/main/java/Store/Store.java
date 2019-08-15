package Store;

import Inventory.Product;
import People.Person;
import java.util.List;

public class Store {

    private static Store store;

    private List<Person> employees;
    private String name;
    private List<Product> productsList;

    /**
     * @param employees Employees that works in the store
     * @param name Store's name
     * @param productsList Available products in the store
     */
    private Store(List<Person> employees, String name, List<Product> productsList) {
        this.employees = employees;
        this.name = name;
        this.productsList = productsList;
    }

    /**
     * @return List of employees
     */
    public List<Person> getEmployees() {
        return employees;
    }

    /**
     * @return List of products in the store
     */
    public List<Product> getProductsList(){
        return this.productsList;
    }

    /**
     * @param employees Employees that works in the store
     * @param nombre Store's name
     * @param productsList Available products in the store
     * @return A new instance of the store
     */
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

    /**
     *  The store opens
     */
    public void openStore(){
        System.out.println(this.name + " is open");
    }

    /**
     *  The store closes
     */
    public void closeStore(){
        System.out.println("Closing store");
    }

}

