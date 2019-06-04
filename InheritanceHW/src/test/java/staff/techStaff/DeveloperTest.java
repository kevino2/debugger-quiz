package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {


    Developer developer;

    @Before
    public void setup() {
        developer = new Developer("Rex", "A125632F", 70);
    }


    @Test
    public void canGetName() {
        assertEquals("Rex", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("A125632F", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(70, developer.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(0.7, developer.payBonus(), 0);
    }

}

