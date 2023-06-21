import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DeveloperTest {
    private String name;
    private String niNumber;
    private double salary;

    private Employee developer;

    @Before
    public void setUp() {
        name = "Spider-Man";
        niNumber = "SUPERHERO821659";
        salary = 1542.6528;
        developer = new Developer(name, niNumber, salary);
    }

    @Test
    public void developerClassHasAccessTogetNameandgetNiNumberFromEmployeeClass() {
        // inherited from Employee class
        assertEquals(name, developer.getName());
        assertEquals(niNumber, developer.getNiNumber());
    }

    @Test
    public void developerClassHasAccessTosetNameandsetNiNumberFromEmployeeClass() {
        // inherited from Employee class
        assertEquals(name, developer.setName());
        assertEquals(niNumber, developer.setNiNumber());
    }



}
