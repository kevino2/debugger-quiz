package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

private Director director;

@Before
    public void setup() {
    director = new Director("Bob", "Q1256326P", 200000, "Board of Directors", 1000000);
}

    @Test
    public void canGetDeptName() {
        assertEquals("Board of Directors", director.getDeptName());
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("Q1256326P", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(200000, director.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(2000, director.payBonus(), 0);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget(), 0);
    }
}





