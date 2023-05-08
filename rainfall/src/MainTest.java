import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
    
    @Test
    public void test() {

        double[] readings = { 84, 73.5, 22.1, 0.0, 11.1, -5.2, 4.8, -19.4, 33.1, 0.0, 15.3, 22.1};
        assertEquals(26.6, Main.rainfall(readings), .1);
    }
}
