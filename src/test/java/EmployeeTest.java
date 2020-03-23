import Staff.Employee;
import Staff.Management.Director;
import Staff.Management.Manager;
import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void canGetName(){
        employee = new Manager("Emma", 1234, 30000.00, "Sales");
        assertEquals("Emma", employee.getName());

    }

    @Test
    public void canGetNINumber(){
        employee = new Developer("Emma", 9876543, 35000.00);
        assertEquals(9876543, employee.getNINumber());
    }

    @Test
    public void canGetSalary(){
        employee = new DatabaseAdmin("Emma", 7657658, 20000.00);
        assertEquals(20000, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        employee = new Developer("Emma", 0000000, 40000.00);
        Double increase = 1200.00;
        employee.raiseSalary(increase);
        assertEquals(41200.00, employee.getSalary(), 0.01);
    }

    @Test
    public void cantEnterNegativeValue(){
        employee = new Developer("Emma", 0000000, 40000.00);
        Double increase = -1200.00;
        employee.raiseSalary(increase);
        assertEquals(40000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canSetName(){
        employee = new Developer("Emma", 0000000, 40000.00);
        employee.setName("Jim");
        assertEquals("Jim", employee.getName());

    }

    @Test
    public void cantEnterNullValue(){
        employee = new Developer("Emma", 0000000, 40000.00);
        employee.setName(null);
        assertEquals("Emma", employee.getName());
    }

}
