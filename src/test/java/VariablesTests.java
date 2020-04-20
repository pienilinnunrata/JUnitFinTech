import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VariablesTests {

    Rational rational;

    @Before
    public void setup() {
        rational = new Rational();
    }

    @Test
    public void testSetNumerator() {
        rational.setNumerator(5);
        assertEquals("Numerator isn't being set correctly", 5, rational.getNumerator());
    }

    @Test
    public void testSetDenominator() {
        rational.setNumerator(1);
        rational.setDenominator(5);
        assertEquals("Denominator isn't being set correctly", 5, rational.getDenominator());
    }

    @Test
    public void testReduceAfterSettingNumerator() {
        Rational number = new Rational(1, 10);
        number.setNumerator(5);
        assertEquals("Reducing hasn't been done", "1/2", number.toString());
    }

    @Test
    public void testReduceAfterSettingDenominator() {
        Rational number = new Rational(5, 8);
        number.setDenominator(10);
        assertEquals("Reducing hasn't been done", "1/2", number.toString());
    }
}
