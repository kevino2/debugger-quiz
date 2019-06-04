package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup() {
        databaseAdmin = new DatabaseAdmin("Tex", "A125632F", 70);
    }


    @Test
    public void canGetName() {
        assertEquals("Tex", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("A125632F", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(70, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(0.7, databaseAdmin.payBonus(), 0);
    }

}
