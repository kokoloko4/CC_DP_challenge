package People;

import People.Person;
import Utils.Utils;

public class Employee extends Person {

    public Employee() {
        super.name = Utils.generateName();
        super.address = Utils.generateAddress();
        super.id = Utils.generateId();
        super.phone = Utils.generatePhone();
    }

    public void sell (String product) {

    }
}
