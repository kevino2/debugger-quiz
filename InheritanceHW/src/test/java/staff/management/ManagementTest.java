package staff.management;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagementTest {

    private Manager manager;

    @Before
    public void setUp() {

        manager = new Manager("Jimbo", "AB123455C", 100, "Shipping");
    }


    @Test
    public void canGetDeptName() {
        assertEquals("Shipping", manager.getDeptName());
    }

    @Test
    public void canGetName() {
        assertEquals("Jimbo", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("John");
        assertEquals("John", manager.getName());
    }

    @Test
    public void cantSetEmptyName__emptyString() {
        manager.setName("");
        assertEquals("Jimbo", manager.getName());
    }


    @Test
    public void canGetNINumber() {
        assertEquals("AB123455C", manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, manager.getSalary(), 0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(1, manager.payBonus(), 0);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(14);
        assertEquals(114, manager.getSalary(), 0);
    }

    @Test
    public void noNegativeRaise() {
        manager.raiseSalary(-10);
        assertEquals(100, manager.getSalary(), 0);
    }


}
