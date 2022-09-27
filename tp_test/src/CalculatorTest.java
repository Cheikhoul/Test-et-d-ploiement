import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
    
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void substraction() {
        assertEquals(2, calculator.sub(3, 1));
    }

    @Test
    public void multiplication() {
        assertEquals(4, calculator.mul(2, 2));
    }

    @Test
    public void division() {
        assertEquals(2, calculator.div(4, 2));
    }

    @Test
    public void divisionParZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.div(4, 0));
    }
}
