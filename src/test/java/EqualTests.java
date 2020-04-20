import org.junit.Test;

import static org.junit.Assert.*;

public class EqualTests {
    Rational rational1;
    Rational rational2;

    @Test
    public void testEqualRationals() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 2);
        assertTrue("Two rationals must be equal", rational1.equals(rational2));
    }

    @Test
    public void testNotEqualRationals() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(1, 2);
        assertFalse("Two rationals must not be equal", rational1.equals(rational2));
    }

    @Test
    public void testNotEqualWithNull() {
        rational1 = new Rational();
        assertFalse("Two rationals must not be equal", rational1.equals(null));
    }

    @Test
    public void testNotEqualToOtherObj() {
        rational1 = new Rational();
        Object obj = new Object();
        assertFalse("Two rationals must not be equal", rational1.equals(obj));
    }
}
