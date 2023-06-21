// this is a subclass of the Employee class :) (uses inheritance)
public class Developer extends Employee {

    public Developer(String name, String niNumber, double salary) {
        // super is used to grab the properties/methods from the Employee class which is where Developer has inherited from
        super(name, niNumber, salary);
    }



}
