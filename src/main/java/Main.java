import Inventory.*;
import People.Person;
import People.PersonFactory;
import Store.Store;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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

        Product vanillaCookie = cookieFactory.createVanillaProduct();
        Product chocolateCookie = cookieFactory.createChocolateProduct();

        Product vanillaMilk = milkFactory.createVanillaProduct();
        Product chocolateMilk = milkFactory.createChocolateProduct();

        productsList.add(vanillaCookie);
        productsList.add(chocolateCookie);
        productsList.add(vanillaMilk);
        productsList.add(chocolateMilk);

        Store store = Store.getStore(employees,"tiendita", productsList);

        store.openStore();

        /*store.sell(vanillaCookie, clients.get(0));
        store.sell(vanillaCookie, clients.get(0));
        store.sell(vanillaCookie, clients.get(4));
        store.sell(ChocolateCookie, clients.get(4));
        store.sell(vanillaCookie, clients.get(7));
        store.sell(vanillaCookie, clients.get(7));
        store.sell(vanillaCookie, clients.get(7));
        store.sell(vanillaCookie, clients.get(3));
        store.sell(chocolateMilk, clients.get(9));
        store.sell(ChocolateCookie, clients.get(9));
        store.sell(ChocolateCookie, clients.get(9));
        store.sell(ChocolateCookie, clients.get(1));*/

        store.closeStore();
    }

}
