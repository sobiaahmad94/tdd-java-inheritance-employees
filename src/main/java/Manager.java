// Manager class is a subclass of the Employee class
public abstract class Manager extends Employee {

    public String deptName;
    public String emailAddress;

    // constructor which uses stuff from the Employee class
    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
//        this.emailAddress;
    }

    // getter func
    public String getDeptName() {
        return deptName;
        // it said to make deptName private in Manager but then obvs Director couldn't access it so I changed it to public
    }

    // setter func
    public String setDeptName() {
        return this.deptName;
        // it said to make deptName private in Manager but then obvs Director couldn't access it so I changed it to public
    }

//    // setter func
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    // getter func
//    public String setEmailAddress() {
//        return this.emailAddress = emailAddress;
//        // it said to make deptName private in Manager but then obvs Director couldn't access it so I changed it to public
//    }
//
//    public abstract String emailAddress(String emailAddress);

}
