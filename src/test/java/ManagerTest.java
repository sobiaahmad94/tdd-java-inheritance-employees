import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ManagerTest{
    private Director director;
    private String name;
    private String niNumber;
    private double salary;
    private String deptName;

        @Before
        public void setUp() {
            name = "Spider-Man";
            niNumber = "SUPERHERO821659";
            salary = 1542.6528;
            deptName = "Superhero stuff at The Daily Bugle";
            director = new Director(name, niNumber, salary, deptName);
        }

        @Test
         public void managerClassHasAccessTogetNameandgetNiNumber() {
            // inherited from Employee class
            assertEquals(name, director.getName());
            assertEquals(niNumber, director.getNiNumber());
        }

        @Test
        public void managerClassHasAccessTosetNameandsetNiNumber() {
        // inherited from Employee class
            assertEquals(name, director.setName());
            assertEquals(niNumber, director.setNiNumber());
        }



}
