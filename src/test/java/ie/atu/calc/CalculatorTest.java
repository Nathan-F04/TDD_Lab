package ie.atu.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator mycalc;

    @Test
    void addTest()
    {
        mycalc=new Calculator();
        assertEquals(10,mycalc.add(4,6));

    }
    @Test
    void multiTest()
    {
        mycalc=new Calculator();
        assertEquals(24,mycalc.multi(4,6));

    }
    @Test
    void subTest()
    {
        mycalc=new Calculator();
        assertEquals(2,mycalc.sub(8,6));

    }
    @Test
    void divTest()
    {
        mycalc=new Calculator();
        assertEquals(4,mycalc.div(8,2));
    }

}
