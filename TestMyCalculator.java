import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyCalculator {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void substraction() {
        assertEquals(2, calculator.sub(3, 1));
    }

    @Test
    void multiplication() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void division() {
        assertEquals(2, calculator.add(4, 2));
    }
}
