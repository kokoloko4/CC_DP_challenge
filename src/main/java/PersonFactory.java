import People.Client;
import People.Employee;
import People.Person;

import java.math.BigInteger;

public class PersonFactory {

    public static Person createClient(double budget, BigInteger age ) { return new Client(budget, age); }

    public static Person createEmployee () { return new Employee(); }


}
