package Utils;

import Inventory.Item;
import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;

public class Utils {

    static Faker faker = new Faker();

    /**
     * @return Random name
     */
    public static String generateName(){
        return faker.harryPotter().character();
    }

    /**
     * @return Random address
     */
    public static String generateAddress(){
        return faker.address().fullAddress();
    }

    /**
     * @return Random phone's number
     */
    public static String generatePhone(){
        return faker.phoneNumber().cellPhone();
    }

    /**
     * @return Random id
     */
    public static String generateId(){
        return faker.number().digits(9);
    }

    /**
     * @param size Quantity of elements in the new list
     * @param name Name of all elements in te list
     * @param price Price of the all elements in the list
     * @return A list of elements with different ids
     */
    public static List<Item> generateItemsList(int size, String name, String price){
        List<Item> items = new LinkedList<Item>();
        for (int i=0;i<size;i++){
            Item item = new Item(faker.number().numberBetween(0,1000000), name, price);
            while (isItemInList(item, items)){
                item = new Item(faker.number().numberBetween(0,1000000), name, price); }
            items.add(item);
        }
        return items;
    }

    /**
     * @param expectedItem A item to find in the list
     * @param lista A list where the expectedItem will be found
     * @return True if element exist in the list or false if not
     */
    public static boolean isItemInList(Item expectedItem, List<Item> lista){
        for(Item item: lista){
            if (expectedItem.id==item.id){
                return true;
            }
        }
        return false;
    }

}
