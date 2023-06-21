// this is a subclass of Manager btw (not a subclass of Employee)

public class Director extends Manager {

    public Director(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary, deptName);
    }

//    @Override
//    public String email(String emailAddress) {
//        return "I'm sending a wee email to you to say you're a 'Class Employee' (pun intended, hehehee!) This is from: " + emailAddress;
//    }


}
