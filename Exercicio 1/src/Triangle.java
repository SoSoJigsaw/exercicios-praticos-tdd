public class Triangle {
    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getType() {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "Not a valid triangle";
        }
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            return "Not a valid triangle";
        }
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        }
        if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
