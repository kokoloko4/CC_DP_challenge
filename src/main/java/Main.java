import People.Person;
import Store.Item;
import Store.Product;
import Store.Store;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Queue<Item> vanillaCookie_items = new LinkedList<Item>();
        Queue<Item> chocolateCookie_items = new LinkedList<Item>();
        Queue<Item> lactoseFreeMilk_items = new LinkedList<Item>();
        Queue<Item> NormalMilk_items = new LinkedList<Item>();



        Product vanillaCookie = new Cookie ("vanilla cookie", "1.5", "24", vanillaCookie_items);
        vanillaCookie.addItems(generateItemsList(24));

        Product ChocolateCookie = new Cookie ("chocolate cookie", "2.0", "17", chocolateCookie_items);
        ChocolateCookie.addItems(generateItemsList(17));

        Product VanillaMilk = new Milk ("vanilla milk", "3.6", "22", lactoseFreeMilk_items);
        VanillaMilk.addItems(generateItemsList(22));

        Product chocolateMilk = new Milk ("chocolate milk", "3.1", "54", NormalMilk_items);
        chocolateMilk.addItems(generateItemsList(54));

        productsList.add(vanillaCookie);
        productsList.add(ChocolateCookie);
        productsList.add(VanillaMilk);
        productsList.add(chocolateMilk);
        Store store = new Store(employeesNames,employeesIds,employeesAddresses,employeesphones,"tiendita", productsList);

        store.openStore();


       store.sell(vanillaCookie, clients.get(0));
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
   store.sell(ChocolateCookie, clients.get(1));

        store.closeStore();

    }

}
