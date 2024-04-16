import static org.junit.Assert.*;
import org.junit.Test;

public class PayrollTest {

    @Test
    public void testDeveloperDiscountHighSalary() {
        Employee dev = new Employee("John Doe", "john.doe@example.com", 3000.00, "DESENVOLVEDOR");
        assertEquals(2400.00, dev.calculateNetSalary(), 0.01);
    }

    @Test
    public void testDeveloperDiscountLowSalary() {
        Employee dev = new Employee("Jane Doe", "jane.doe@example.com", 2500.00, "DESENVOLVEDOR");
        assertEquals(2250.00, dev.calculateNetSalary(), 0.01);
    }

    @Test
    public void testDBADiscountHighSalary() {
        Employee dba = new Employee("Alice Bob", "alice.bob@example.com", 2000.00, "DBA");
        assertEquals(1500.00, dba.calculateNetSalary(), 0.01);
    }

    @Test
    public void testDBADiscountLowSalary() {
        Employee dba = new Employee("Bob Alice", "bob.alice@example.com", 1800.00, "DBA");
        assertEquals(1530.00, dba.calculateNetSalary(), 0.01);
    }

    @Test
    public void testManagerDiscountHighSalary() {
        Employee manager = new Employee("Eve Charlie", "eve.charlie@example.com", 5000.00, "GERENTE");
        assertEquals(3500.00, manager.calculateNetSalary(), 0.01);
    }

    @Test
    public void testManagerDiscountLowSalary() {
        Employee manager = new Employee("Charlie Eve", "charlie.eve@example.com", 4000.00, "GERENTE");
        assertEquals(3200.00, manager.calculateNetSalary(), 0.01);
    }
}
