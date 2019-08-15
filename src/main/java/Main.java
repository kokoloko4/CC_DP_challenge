import Inventory.*;
import People.Client;
import People.Employee;
import People.Person;
import Store.Store;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        List<Person> employees = new ArrayList<>();
        for(int i = 0; i < 5 ; i++) {
            employees.add(new Employee.EmployeeBuilder().build());
        }

        List<Person> clients = new ArrayList<>();
        clients.add(new Client.ClientBuilder().setBudget(13.5).setAge(BigInteger.valueOf(23)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(10.8).setAge(BigInteger.valueOf(31)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(9.1).setAge(BigInteger.valueOf(19)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(27.8).setAge(BigInteger.valueOf(25)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(5.0).setAge(BigInteger.valueOf(37)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(14.6).setAge(BigInteger.valueOf(47)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(11.2).setAge(BigInteger.valueOf(81)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(10.1).setAge(BigInteger.valueOf(42)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(13.0).setAge(BigInteger.valueOf(19)).setItemsPurchased().build());
        clients.add(new Client.ClientBuilder().setBudget(43.2).setAge(BigInteger.valueOf(33)).setItemsPurchased().build());

        List<Product> productsList = new ArrayList<>();

        ProductFactory cookieFactory = new CookieFactory();
        ProductFactory milkFactory = new MilkFactory();
        ProductFactory yogurtFactory = new YogurtFactory();

        Product vanillaCookie = cookieFactory.createVanillaProduct();
        Product chocolateCookie = cookieFactory.createChocolateProduct();
        Product strawBerryCookie = cookieFactory.createStrawBerryProduct();

        Product vanillaMilk = milkFactory.createVanillaProduct();
        Product chocolateMilk = milkFactory.createChocolateProduct();
        Product strawBerryMilk = cookieFactory.createStrawBerryProduct();

        Product vanillaYogurt = yogurtFactory.createVanillaProduct();
        Product chocolateYogurt = yogurtFactory.createChocolateProduct();
        Product strawBerryYogurt = yogurtFactory.createStrawBerryProduct();

        productsList.add(vanillaCookie);
        productsList.add(chocolateCookie);
        productsList.add(strawBerryCookie);
        productsList.add(vanillaMilk);
        productsList.add(chocolateMilk);
        productsList.add(strawBerryMilk);
        productsList.add(vanillaYogurt);
        productsList.add(chocolateYogurt);
        productsList.add(strawBerryYogurt);

        Store store = Store.getStore(employees,"tiendita", productsList);

        store.openStore();

        Employee e = (Employee) store.getEmployees().get(0);
        e.sell(vanillaCookie, (Client) clients.get(0), store);
        e = (Employee) store.getEmployees().get(1);
        e.sell(strawBerryYogurt, (Client) clients.get(1), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(vanillaCookie, (Client) clients.get(2), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(strawBerryCookie, (Client) clients.get(3), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(vanillaMilk, (Client) clients.get(4), store);
        e = (Employee) store.getEmployees().get(0);
        e.sell(vanillaCookie, (Client) clients.get(5), store);
        e = (Employee) store.getEmployees().get(1);
        e.sell(strawBerryMilk, (Client) clients.get(6), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(strawBerryCookie, (Client) clients.get(7), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(vanillaCookie, (Client) clients.get(8), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(chocolateCookie, (Client) clients.get(9), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(strawBerryCookie, (Client) clients.get(0), store);
        e = (Employee) store.getEmployees().get(0);
        e.sell(strawBerryCookie, (Client) clients.get(1), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(vanillaCookie, (Client) clients.get(2), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(vanillaCookie, (Client) clients.get(1), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(vanillaMilk, (Client) clients.get(2), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(vanillaCookie, (Client) clients.get(3), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(strawBerryMilk, (Client) clients.get(4), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(vanillaCookie, (Client) clients.get(5), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(chocolateCookie, (Client) clients.get(6), store);
        e = (Employee) store.getEmployees().get(3);
        e.sell(vanillaMilk, (Client) clients.get(7), store);
        e = (Employee) store.getEmployees().get(0);
        e.sell(vanillaCookie, (Client) clients.get(8), store);
        e = (Employee) store.getEmployees().get(0);
        e.sell(vanillaCookie, (Client) clients.get(9), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(strawBerryMilk, (Client) clients.get(0), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(strawBerryCookie,(Client)  clients.get(4), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(vanillaCookie, (Client) clients.get(5), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(vanillaYogurt, (Client) clients.get(6), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(vanillaCookie, (Client) clients.get(7), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(strawBerryCookie, (Client) clients.get(8), store);
        e = (Employee) store.getEmployees().get(2);
        e.sell(vanillaYogurt, (Client) clients.get(9), store);
        e = (Employee) store.getEmployees().get(4);
        e.sell(strawBerryMilk, (Client) clients.get(0), store);
        e = (Employee) store.getEmployees().get(0);
        e.sell(strawBerryCookie, (Client) clients.get(0), store);

        store.closeStore();

        for (int i = 0 ; i < clients.size() ; i++){
            Client c = (Client) clients.get(i);
            c.obtainBill();
        }
    }

}
