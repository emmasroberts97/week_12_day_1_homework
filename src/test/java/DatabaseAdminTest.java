import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Emma", 1234543, 32000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Emma", admin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1234543, admin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(32000, admin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        Double increase = 10500.00;
        admin.raiseSalary(increase);
        assertEquals(42500.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(320, admin.payBonus(), 0.01);
    }
}
