import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSuite2 {

    private calculator c1;
    @Before
    public void setUp() {
        c1 = new calculator();
    }

    @Test
    public void addition() {
        assertEquals(9, c1.addition(4, 5));
        assertEquals(-3, c1.addition(-8, 5));
        assertEquals(0, c1.addition(0, 0));
        System.out.println("From TestSuite2");
    }

    @Test
    public void subtraction() {
        assertEquals(-1, c1.subtraction(4, 5));
        assertEquals(-13, c1.subtraction(-8, 5));
        assertEquals(0, c1.subtraction(0, 0));
        System.out.println("From TestSuite2");

    }

    @Test
    public void multiplication() {
        assertEquals(20, c1.multiplication(4, 5));
        assertEquals(-40, c1.multiplication(8, -5));
        assertEquals(0, c1.multiplication(0, 0));
        System.out.println("From TestSuite2");
    }

    @Test
    public void division() {
        assertEquals(2, c1.division(10, 5));
        assertEquals(-2, c1.division(10, -5));
        assertEquals(0, c1.division(0, 10));
        System.out.println("From TestSuit2");
        // Test division by zero
        try {
            c1.division(5, 0);
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

    @After
    public void tearDown() throws Exception{
        c1 = null;
    }

}
