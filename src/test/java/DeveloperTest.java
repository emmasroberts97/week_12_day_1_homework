import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Emma", 12341234, 45000.00);
    }


    @Test
    public void canGetName(){
        assertEquals("Emma", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(12341234, developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        Double increase = 10500.00;
        developer.raiseSalary(increase);
        assertEquals(55500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(450, developer.payBonus(), 0.01);
    }
}
