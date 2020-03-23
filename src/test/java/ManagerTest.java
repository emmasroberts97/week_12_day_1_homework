import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Emma", 1234567, 40000.00, "Retail");
    }

    @Test
    public void canGetName(){
        assertEquals("Emma", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1234567, manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDept(){
        assertEquals("Retail", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        Double increase = 12500.00;
        manager.raiseSalary(increase);
        assertEquals(52500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(400, manager.payBonus(), 0.01);
    }


}
