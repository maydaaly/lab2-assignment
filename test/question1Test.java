import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class question1Test {
    @Test
    public void even (){
        assertEquals("even", question1.even_odd(5000));
        assertEquals("even", question1.even_odd(0));
        assertEquals("even", question1.even_odd(34));
        assertEquals("even", question1.even_odd(112));}
    @Test
    public void odd(){
        assertEquals("odd", question1.even_odd(9));
        assertEquals("odd", question1.even_odd(13));
        assertEquals("odd", question1.even_odd(777));}
    @Test
    public void invalid(){
        assertEquals("invalid input", question1.even_odd(-22));}
}
