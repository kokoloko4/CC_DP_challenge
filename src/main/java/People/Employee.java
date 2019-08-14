package People;

import People.Person;

public class Employee extends Person {

    public Employee() {
        super.name = Person.generateName();
        super.address = Person.generateAddress();
        super.id = Person.generateId();
        super.phone = Person.generatePhone();
    }

    public void sell (String product) {

    }
}
