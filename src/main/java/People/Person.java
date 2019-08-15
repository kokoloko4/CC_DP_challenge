package People;

import Inventory.Item;
import Inventory.Product;
import Store.Store;
import Utils.Utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Person {

    protected String name;
    protected String id;
    protected String address;
    protected String phone;

    /**
     * @param name Person's name
     * @param id Person's id
     * @param address Person's address
     * @param phone Person's phone
     */
    public Person(String name, String id, String address, String phone) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
    }
}
