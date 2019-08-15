import Inventory.*;
import People.Client;
import People.Employee;
import People.Person;
import People.PersonFactory;
import Store.Store;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String args[]){

        List<Person> employees = new ArrayList<>();
        for(int i = 0; i < 5 ; i++) {
            employees.add(PersonFactory.createEmployee());
        }

        List<Person> clients = new ArrayList<>();
        clients.add(PersonFactory.createClient( 13.5, BigInteger.valueOf(23)));
        clients.add(PersonFactory.createClient(10.8, BigInteger.valueOf(31)));
        clients.add(PersonFactory.createClient(9.1, BigInteger.valueOf(19)));
        clients.add(PersonFactory.createClient(27.8, BigInteger.valueOf(25)));
        clients.add(PersonFactory.createClient(5.0, BigInteger.valueOf(37)));
        clients.add(PersonFactory.createClient(14.6, BigInteger.valueOf(47)));
        clients.add(PersonFactory.createClient(11.2, BigInteger.valueOf(81)));
        clients.add(PersonFactory.createClient(10.1, BigInteger.valueOf(42)));
        clients.add(PersonFactory.createClient(13.0, BigInteger.valueOf(19)));
        clients.add(PersonFactory.createClient(43.2, BigInteger.valueOf(33)));

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

        Employee e = (Employee) employees.get(0);
        e.sell(vanillaCookie, (Client) clients.get(0), store);
        e = (Employee) employees.get(1);
        e.sell(strawBerryYogurt, (Client) clients.get(1), store);
        e = (Employee) employees.get(2);
        e.sell(vanillaCookie, (Client) clients.get(2), store);
        e = (Employee) employees.get(3);
        e.sell(strawBerryCookie, (Client) clients.get(3), store);
        e = (Employee) employees.get(4);
        e.sell(vanillaMilk, (Client) clients.get(4), store);
        e = (Employee) employees.get(0);
        e.sell(vanillaCookie, (Client) clients.get(5), store);
        e = (Employee) employees.get(1);
        e.sell(strawBerryMilk, (Client) clients.get(6), store);
        e = (Employee) employees.get(2);
        e.sell(strawBerryCookie, (Client) clients.get(7), store);
        e = (Employee) employees.get(3);
        e.sell(vanillaCookie, (Client) clients.get(8), store);
        e = (Employee) employees.get(4);
        e.sell(chocolateCookie, (Client) clients.get(9), store);
        e = (Employee) employees.get(4);
        e.sell(strawBerryCookie, (Client) clients.get(0), store);
        e = (Employee) employees.get(0);
        e.sell(strawBerryCookie, (Client) clients.get(1), store);
        e = (Employee) employees.get(3);
        e.sell(vanillaCookie, (Client) clients.get(2), store);
        e = (Employee) employees.get(4);
        e.sell(vanillaCookie, (Client) clients.get(1), store);
        e = (Employee) employees.get(4);
        e.sell(vanillaMilk, (Client) clients.get(2), store);
        e = (Employee) employees.get(4);
        e.sell(vanillaCookie, (Client) clients.get(3), store);
        e = (Employee) employees.get(3);
        e.sell(strawBerryMilk, (Client) clients.get(4), store);
        e = (Employee) employees.get(3);
        e.sell(vanillaCookie, (Client) clients.get(5), store);
        e = (Employee) employees.get(3);
        e.sell(chocolateCookie, (Client) clients.get(6), store);
        e = (Employee) employees.get(3);
        e.sell(vanillaMilk, (Client) clients.get(7), store);
        e = (Employee) employees.get(0);
        e.sell(vanillaCookie, (Client) clients.get(8), store);
        e = (Employee) employees.get(0);
        e.sell(vanillaCookie, (Client) clients.get(9), store);
        e = (Employee) employees.get(2);
        e.sell(strawBerryMilk, (Client) clients.get(0), store);
        e = (Employee) employees.get(2);
        e.sell(strawBerryCookie, (Client) clients.get(4), store);
        e = (Employee) employees.get(2);
        e.sell(vanillaCookie, (Client) clients.get(5), store);
        e = (Employee) employees.get(2);
        e.sell(vanillaYogurt, (Client) clients.get(6), store);
        e = (Employee) employees.get(2);
        e.sell(vanillaCookie, (Client) clients.get(7), store);
        e = (Employee) employees.get(2);
        e.sell(strawBerryCookie, (Client) clients.get(8), store);
        e = (Employee) employees.get(2);
        e.sell(vanillaYogurt, (Client) clients.get(9), store);
        e = (Employee) employees.get(4);
        e.sell(strawBerryMilk, (Client) clients.get(0), store);
        e = (Employee) employees.get(0);
        e.sell(strawBerryCookie, (Client) clients.get(0), store);


        store.closeStore();

        for (int i = 0 ; i < clients.size() ; i++){
            Client c = (Client) clients.get(i);
            c.obtainBill(store);
        }
    }

}
