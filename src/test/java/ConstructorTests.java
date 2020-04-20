import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class ConstructorTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testCustomConstructor() {
        Rational rational = new Rational(1, 66);
        assertEquals("Custom constructor returns wrong numerator", 1, rational.getNumerator());
        assertEquals("Custom constructor returns wrong denominator", 66, rational.getDenominator());
    }

    @Test
    public void testZeroDenominatorException() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("division by zero !"));
        Rational rational = new Rational(1, 0);
    }
}
