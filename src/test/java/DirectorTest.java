import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;
    private String name;
    private String niNumber;
    private double salary;
    private String deptName;
    private String newDeptName;

    @Before
    public void setUp() {
        name = "Spider-Man";
        niNumber = "SUPERHERO821659";
        salary = 1542.6528;
        deptName = "Superhero stuff at The Daily Bugle";
        director = new Director(name, niNumber, salary, deptName);
        newDeptName = "Sales";
    }

    @Test
    public void directorClassCanTakePropertiesAndMethodsFromEmployeeClassItsInheritedFrom() {
        // Test inherited properties from Employee class
        assertEquals(name, director.getName());
        assertEquals(niNumber, director.getNiNumber());
        assertEquals(salary, director.getSalary(), 0.01);
    }

    @Test
    public void deptNamePropertyCanBeTakenFromManagerClassItsInheritedFrom() {
        assertEquals(deptName, director.getDeptName());
    }
}
