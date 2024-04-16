import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id;

    private String name;

    private int age;

    private final List<Email> emails;

    public Person() {
        this.emails = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addEmail(Email email) {
        this.emails.add(email);
    }

}
