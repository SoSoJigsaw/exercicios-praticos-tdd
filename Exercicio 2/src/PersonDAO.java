import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public void save(Person person) {

    }

    public List<String> isValidToInclude(Person person) {
        List<String> errors = new ArrayList<>();
        if (!person.getName().matches("[A-Za-z]+\\s[A-Za-z]+")) {
            errors.add("Name must be composed of at least two parts and only contain letters.");
        }
        if (person.getAge() < 1 || person.getAge() > 200) {
            errors.add("Age must be in the range [1, 200].");
        }
        if (person.getEmails().isEmpty()) {
            errors.add("At least one email must be associated.");
        } else {
            for (Email email : person.getEmails()) {
                if (!email.isValid()) {
                    errors.add("Email must be in the format '____@____.____'.");
                }
            }
        }
        return errors;
    }


}
