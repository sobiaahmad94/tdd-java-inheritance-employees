// abstract key word used as this is an abstract class (top of the class inheritance chain)
public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    // double is a primitive data type that is good for floats for something like a salary value

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    // raiseSalary() func

    public double raiseSalary(double money) {
        // salary is an instance variable of the Employee class
        return salary += money;
    }

    // need to create the payBonus() func so it adds 1% to salary
    // 70 = 100%
    // 7 = 10%
    // 0.7 = 1%

    public double payBonus() {
        return 0.01 * salary;
    }

    // getSalary() (func to get salary without bonus)
    public double getSalary() {
        return salary;
    }

    // setSalary()
    public double setSalary() {
        return this.salary;
    }

    // getName() func
    public String getName() {
        return name;
    }

    // setName func
    public String setName() {
        return this.name;
    }

    // getNiNumber() func
    public String getNiNumber() {
        return niNumber;
    }

    // setNiNumber func
    public String setNiNumber() {
        return this.niNumber;
    }



}
