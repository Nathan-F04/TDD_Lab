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

}