import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class PersonTest {
    private PersonDAO personDAO;
    private Person person;

    @Before
    public void setUp() {
        person = new Person();
        personDAO = new PersonDAO();
    }

    @Test
    public void testValidPerson() {
        person.setName("John Doe");
        person.setAge(30);
        person.addEmail(new Email("john.doe@example.com"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testNameWithSinglePart() {
        person.setName("John");
        person.setAge(30);
        person.addEmail(new Email("john@example.com"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Name must be composed of at least two parts."));
    }

    @Test
    public void testNameWithInvalidCharacters() {
        person.setName("John123 Doe");
        person.setAge(30);
        person.addEmail(new Email("john.doe@example.com"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Name must contain only letters."));
    }

    @Test
    public void testAgeBelowMinimum() {
        person.setName("John Doe");
        person.setAge(0);
        person.addEmail(new Email("john.doe@example.com"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Age must be in the range [1, 200]."));
    }

    @Test
    public void testAgeAboveMaximum() {
        person.setName("John Doe");
        person.setAge(201);
        person.addEmail(new Email("john.doe@example.com"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Age must be in the range [1, 200]."));
    }

    @Test
    public void testNoEmails() {
        person.setName("John Doe");
        person.setAge(30);
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("At least one email must be associated."));
    }

    @Test
    public void testInvalidEmailFormat() {
        person.setName("John Doe");
        person.setAge(30);
        person.addEmail(new Email("john.doe"));
        List<String> errors = personDAO.isValidToInclude(person);
        assertFalse(errors.isEmpty());
        assertTrue(errors.contains("Email must be in the format '____@____.____'."));
    }
}
