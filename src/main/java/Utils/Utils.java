package Utils;

import Inventory.Item;
import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;

public class Utils {

    static Faker faker = new Faker();

    public static String generateName(){
        return faker.harryPotter().character();
    }

    public static String generateAddress(){
        return faker.address().fullAddress();
    }

    public static String generatePhone(){
        return faker.phoneNumber().cellPhone();
    }

    public static String generateId(){
        return faker.number().digits(9);
    }

    public static List<Item> generateItemsList(int size){
        List<Item> items = new LinkedList<Item>();
        for (int i=0;i<size;i++){
            Item item = new Item(faker.number().numberBetween(0,1000000));
            while (isItemInList(item, items)){
                item = new Item(faker.number().numberBetween(0,1000000)); }
            items.add(item);
        }
        return items;
    }

    public static boolean isItemInList(Item expectedItem, List<Item> lista){
        for(Item item: lista){
            if (expectedItem.id==item.id){
                return true;
            }
        }
        return false;
    }

}
