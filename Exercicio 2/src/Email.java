public class Email {

    private int id;
    private final String name;

    public Email(String address) {
        this.name = address;
    }

    public boolean isValid() {
        return name.matches("[^@]+@[^@]+\\.[^@]+");
    }
}