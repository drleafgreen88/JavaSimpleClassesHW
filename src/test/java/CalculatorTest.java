import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Test
    public void getAddResult(){
        calculator = new Calculator ();
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void getSubtractResult(){
        calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    public void getMultiplyResult(){
        calculator = new Calculator();
        assertEquals(42, calculator.multiply(6,7));
    }

    @Test
    public void getDivideResult(){
        calculator = new Calculator();
        assertEquals(8.0, calculator.divide(64.0, 8.0), 0.0);
    }
}
