import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(4, 5, 6);
        assertEquals("Scalene", triangle.getType());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(5, 5, 7);
        assertEquals("Isosceles", triangle.getType());
    }

    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(6, 6, 6);
        assertEquals("Equilateral", triangle.getType());
    }

    @Test
    public void testInvalidTriangleZero() {
        Triangle triangle = new Triangle(0, 5, 7);
        assertEquals("Not a valid triangle", triangle.getType());
    }

    @Test
    public void testInvalidTriangleNegative() {
        Triangle triangle = new Triangle(-1, 5, 7);
        assertEquals("Not a valid triangle", triangle.getType());
    }

    @Test
    public void testInvalidTriangleSumOfSides() {
        Triangle triangle = new Triangle(1, 2, 3);
        assertEquals("Not a valid triangle", triangle.getType());
    }

    @Test
    public void testAllZeros() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals("Not a valid triangle", triangle.getType());
    }
}
