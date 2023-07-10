import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalcParamTest {
    private int x;
    private int y;
    private int sum;
    private calculator c1;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {4, 5, 9},
                {-8, 5, -3},
                {0, 0, 0},
                {10, 5, 15},
                {20, -5, 15},
                {0, 10, 10}
        });
    }

    public CalcParamTest(int x, int y, int sum) {
        this.x = x;
        this.y = y;
        this.sum = sum;
        this.c1 = new calculator();
    }

    @Test
    public void testAddition() {
        int actualSum = c1.addition(x, y);
        assertEquals(sum, actualSum);
    }
}
