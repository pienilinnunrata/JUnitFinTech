import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodsTests {
    Rational rational;

    @Before
    public void setup() {
        rational = new Rational(1,2);
    }

    @Test
    public void testToString() {
        rational.setNumerator(1);
        rational.setDenominator(2);
        assertEquals("Incorrect string representation", "1/2", rational.toString());
    }

    @Test
    public void testToStringNegativeRational() {
        rational.setNumerator(-1);
        rational.setDenominator(2);
        assertEquals("Incorrect string representation", "-1/2", rational.toString());
    }

    @Test
    public void testReduce() {
        rational.setNumerator(5);
        rational.setDenominator(10);
        assertEquals("Incorrect numerator reducing", 1, rational.getNumerator());
        assertEquals("Incorrect denominator reducing", 2, rational.getDenominator());
    }

    @Test
    public void testNoReduce() {
        rational.setNumerator(1);
        rational.setDenominator(4);
        assertEquals("Incorrect numerator reducing", 1, rational.getNumerator());
        assertEquals("Incorrect denominator reducing", 4, rational.getDenominator());
    }

    @Test
    public void testReduceWithBiggerNumerator() {
        rational.setNumerator(4);
        assertEquals("Incorrect numerator reducing", 2, rational.getNumerator());
        assertEquals("Incorrect denominator reducing", 1, rational.getDenominator());
    }

    @Test
    public void testSimplifyMinusesInDenominator() {
        rational.setNumerator(1);
        rational.setDenominator(-5);
        assertEquals("Incorrect simplifying minuses in numerator", -1, rational.getNumerator());
        assertEquals("Incorrect simplifying minuses in denominator", 5, rational.getDenominator());
    }

    @Test
    public void testSimplifyMinusesInNumerator() {
        rational.setNumerator(-1);
        rational.setDenominator(5);
        assertEquals("Incorrect simplifying minuses in numerator", -1, rational.getNumerator());
        assertEquals("Incorrect simplifying minuses in denominator", 5, rational.getDenominator());
    }
}
