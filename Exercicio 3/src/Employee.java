public class Employee {
    private String name;
    private String email;
    private double baseSalary;
    private String role;

    public Employee(String name, String email, double baseSalary, String role) {
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.role = role;
    }

    public double calculateNetSalary() {
        switch (role.toUpperCase()) {
            case "DESENVOLVEDOR":
                if (baseSalary >= 3000) return baseSalary * 0.8;
                else return baseSalary * 0.9;
            case "DBA":
            case "TESTADOR":
                if (baseSalary >= 2000) return baseSalary * 0.75;
                else return baseSalary * 0.85;
            case "GERENTE":
                if (baseSalary >= 5000) return baseSalary * 0.7;
                else return baseSalary * 0.8;
            default:
                return baseSalary;
        }
    }
}

