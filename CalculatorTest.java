import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculator.calculate(2, 3, '+'));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, Calculator.calculate(5, 3, '-'));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, Calculator.calculate(3, 5, '*'));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculator.calculate(6, 3, '/'));
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(Double.NaN, Calculator.calculate(2, 0, '/'));
    }

    @Test
    public void testInvalidOperation() {
        assertEquals(0, Calculator.calculate(2, 3, '%')); // Invalid operation
    }
}
