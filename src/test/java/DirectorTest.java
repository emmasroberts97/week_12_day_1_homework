import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Emma", 7654321, 65000.00, "Marketing", 200000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Emma", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(7654321, director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(65000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(200000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        Double increase = 10000.00;
        director.raiseSalary(increase);
        assertEquals(75000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(1300, director.payBonus(), 0.01);
    }
}
