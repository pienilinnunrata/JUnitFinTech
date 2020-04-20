import org.junit.Test;

import static org.junit.Assert.*;

public class LessOrEqualTests {
    Rational rational1;
    Rational rational2;

    @Test
    public void testLessOrEqualLess() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 1);
        assertTrue("The first rational must be less than the second", rational1.lessOrEqual(rational2));
    }

    @Test
    public void testLessOrEqualEqual() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 2);
        assertTrue("The first rational must be equal to the second", rational1.lessOrEqual(rational2));
    }

    @Test
    public void testLessOrEqualBigger() {
        rational1 = new Rational(1, 1);
        rational2 = new Rational(1, 2);
        assertFalse("The first rational must be not equal and not less than the second", rational1.lessOrEqual(rational2));
    }
}
