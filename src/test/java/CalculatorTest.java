import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2,3));
        assertEquals(10, calc.add(7,3));
        assertEquals(100, calc.add(89,11));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.dif(10,3));
        assertEquals(993, calc.dif(1000,7));
        assertEquals(10, calc.dif(100,90));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.div(6,3));
        assertEquals(5, calc.div(25,5));
        assertThrows(ArithmeticException.class, () -> calc.div(1000,0));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.times(5,2));
        assertEquals(-10, calc.times(5,-2));
        assertEquals(100, calc.times(10,10));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.solver(2,2,4));
        assertEquals(20, calc.solver(10,5,2));
        assertEquals(30, calc.solver(10,2,10));
    }
}