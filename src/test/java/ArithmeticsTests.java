import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class ArithmeticsTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    Rational rational1;
    Rational rational2;

    // PLUS
    @Test
    public void testPlusSameDenominator() {
        rational1 = new Rational(1, 5);
        rational2 = new Rational(2, 5);
        assertEquals("The sum is incorrect", "3/5", rational1.plus(rational2).toString());
    }

    @Test
    public void testPlusDifferentDenominator() {
        rational1 = new Rational(1, 6);
        rational2 = new Rational(2, 3);
        assertEquals("The sum is incorrect", "5/6", rational1.plus(rational2).toString());
    }

    @Test
    public void testPlusDifferentSign() {
        rational1 = new Rational(-1, 3);
        rational2 = new Rational(2, 3);
        assertEquals("The sum is incorrect", "1/3", rational1.plus(rational2).toString());
    }

    @Test
    public void testPlusWithReducing() {
        rational1 = new Rational(1, 6);
        rational2 = new Rational(2, 6);
        assertEquals("The sum is incorrect", "1/2", rational1.plus(rational2).toString());
    }

    // MINUS
    @Test
    public void testMinusSameDenominator() {
        rational1 = new Rational(2, 5);
        rational2 = new Rational(1, 5);
        assertEquals("The diff is incorrect", "1/5", rational1.minus(rational2).toString());
    }

    @Test
    public void testMinusDifferentDenominator() {
        rational1 = new Rational(5, 6);
        rational2 = new Rational(2, 3);
        assertEquals("The diff is incorrect", "1/6", rational1.minus(rational2).toString());
    }

    @Test
    public void testMinusDifferentSign() {
        rational1 = new Rational(1, 3);
        rational2 = new Rational(-1, 3);
        assertEquals("The diff is incorrect", "2/3", rational1.minus(rational2).toString());
    }

    @Test
    public void testMinusWithReducing() {
        rational1 = new Rational(5, 6);
        rational2 = new Rational(2, 6);
        assertEquals("The diff is incorrect", "1/2", rational1.minus(rational2).toString());
    }

    // MULTIPLY
    @Test
    public void testMultiplyTwoPositiveRationals() {
        rational1 = new Rational(1, 6);
        rational2 = new Rational(1, 2);
        assertEquals("The result is incorrect", "1/12", rational1.multiply(rational2).toString());
    }

    @Test
    public void testMultiplyTwoNegativeRationals() {
        rational1 = new Rational(-1, 6);
        rational2 = new Rational(-1, 2);
        assertEquals("The result is incorrect", "1/12", rational1.multiply(rational2).toString());
    }

    @Test
    public void testMultiplyPositiveAndNegativeRationals() {
        rational1 = new Rational(-1, 6);
        rational2 = new Rational(1, 2);
        assertEquals("The result is incorrect", "-1/12", rational1.multiply(rational2).toString());
    }

    @Test
    public void testMultiplyByZero() {
        rational1 = new Rational(1, 666);
        rational2 = new Rational();
        assertEquals("The result is incorrect", "0/1", rational1.multiply(rational2).toString());
    }

    // DIVIDE
    @Test
    public void testDivideTwoPositiveRationals() {
        rational1 = new Rational(1, 6);
        rational2 = new Rational(1, 2);
        assertEquals("The result is incorrect", "1/3", rational1.divide(rational2).toString());
    }

    @Test
    public void testDivideTwoNegativeRationals() {
        rational1 = new Rational(-1, 7);
        rational2 = new Rational(-1, 2);
        assertEquals("The result is incorrect", "2/7", rational1.divide(rational2).toString());
    }

    @Test
    public void testDividePositiveAndNegativeRationals() {
        rational1 = new Rational(-1, 7);
        rational2 = new Rational(1, 2);
        assertEquals("The result is incorrect", "-2/7", rational1.divide(rational2).toString());
    }

    @Test
    public void testDivideByZero() {
        rational1 = new Rational(-1, 7);
        rational2 = new Rational();

        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("division by zero !"));
        rational1.divide(rational2);
    }
}
