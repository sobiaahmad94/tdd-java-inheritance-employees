import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DatabaseAdminTest {
    private String name;
    private String niNumber;
    private double salary;

    private Employee databaseAdmin;

    @Before
    public void setUp() {
        name = "Spider-Man";
        niNumber = "SUPERHERO821659";
        salary = 1542.6528;
        databaseAdmin = new DatabaseAdmin(name, niNumber, salary);
    }

    @Test
    public void databaseAdminClassHasAccessTogetNameandgetNiNumberFromEmployeeClass() {
        // inherited from Employee class
        assertEquals(name, databaseAdmin.getName());
        assertEquals(niNumber, databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminClassHasAccessTosetNameandsetNiNumberFromEmployeeClass() {
        // inherited from Employee class
        assertEquals(name, databaseAdmin.setName());
        assertEquals(niNumber, databaseAdmin.setNiNumber());
    }






}
