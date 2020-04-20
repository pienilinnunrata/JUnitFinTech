import org.junit.Test;

import static org.junit.Assert.*;

public class LessTests {
    Rational rational1;
    Rational rational2;

    @Test
    public void testLessLess() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(1, 2);
        assertTrue("The first rational must be lesser", rational1.less(rational2));
    }

    @Test
    public void testLessEqual() {
        rational1 = new Rational(1, 2);
        rational2 = new Rational(1, 2);
        assertFalse("The first rational must not be lesser", rational1.less(rational2));
    }

    @Test
    public void testLessBigger() {
        rational1 = new Rational(1, 1);
        rational2 = new Rational(1, 2);
        assertFalse("The first rational must not be lesser", rational1.less(rational2));
    }
}
