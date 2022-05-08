import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class question2Test {
    @Test
    public void test1() {
        int[] test1arr = {3, -11, 7, 77, 24};
        assertEquals("min is -11 and max is 77", question2.min_max(test1arr));}

    @Test
    public void test2() {
        int[] test2arr = {65, -80, 4, 12, 109};
        assertEquals("min is -80 and max is 109", question2.min_max(test2arr));}

    @Test
    public void test3() {
        int[] test3arr = {0, 42, 2, 23, 50,13};
        assertEquals("min is 0 and max is 50", question2.min_max(test3arr));}
}