import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lab10_Test {
    private Lab10_New calculator;

    @BeforeEach
    void setUp() {
        calculator = new Lab10_New();
    }

    @AfterEach
    void tearDown() {
        calculator.dispose();
    }

 
    @Test
    void testIsNumeric() {
        assertTrue(calculator.isNumeric("123"));
        assertTrue(calculator.isNumeric("3.14"));
        assertFalse(calculator.isNumeric("abc"));
        System.out.println("Output: Test Cases for isNumeric passed");
    }

    @Test
    void testIsOperator() {
        assertTrue(calculator.isOperator("+"));
        assertTrue(calculator.isOperator("-"));
        assertTrue(calculator.isOperator("*"));
        assertTrue(calculator.isOperator("/"));
        assertFalse(calculator.isOperator("5"));
        System.out.println("Output: Test Cases for isOperator passed");
    }

    @Test
    void testCalculate() {
        assertEquals(8.0, calculator.calculate(5.0, 3.0, "+"));
        assertEquals(10.0, calculator.calculate(15.0, 5.0, "-"));
        assertEquals(20.0, calculator.calculate(5.0, 4.0, "*"));
        assertEquals(2.5, calculator.calculate(5.0, 2.0, "/"));
        System.out.println("Output: Test Cases for calculate passed");
    }
}
