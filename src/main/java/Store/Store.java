package Store;

import People.Client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Store {
    public List<String> employeesNames = new LinkedList<String>();
    public List<String> employeesIds = new LinkedList<>();
    public List<String> employeesAddresses = new ArrayList<>();
    public List<String> employeesphones = new LinkedList<>();
    public String nombre;
    public List<Product> productsList;

    public Store(List<String> employeesNames, List<String> employeesIds, List<String> employeesAddresses, List<String> employeesphones, String nombre, List<Product> productsList) {
        this.employeesNames = employeesNames;
        this.employeesIds = employeesIds;
        this.employeesAddresses = employeesAddresses;
        this.employeesphones = employeesphones;
        this.nombre = nombre;
        this.productsList = productsList;
    }

    public void openStore(){
        System.out.println("Store.Store is open");
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

