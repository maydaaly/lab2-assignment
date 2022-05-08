import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class question3Test {
    @Test
    public void invalidinput (){
        char[] x = {'a','b','c','c','a','b','b'};
        char[] a = {'a','a','b','d','d','c','a','b','b','a','b'};
        assertEquals ("invalid input", question3.clock( x ));
        assertEquals ("invalid input", question3.clock( a ));
    }
    @Test
    public void adup_edge (){
        char[] a = {'a','a','b','d','c','a','b','b','a','b'};
        char[] b = {'a','c','a','a','a','b','b','a','b','a','b'};
        char[] c = {'a','b','a','d','c','b','a','b','a','a','a','a'};
        char[] d = {'a','c','a','a','a','a','a','b','a','d','c'};
        char[] e = {'c','b','a','b','b','a','b','a','b','b','a','b','b','d','b','a'};
        char[] f = {'a','a','c','a','a','a','a','b','b','d','b','d','a','a'};
        char[] g = {'a','a','c','b','a','b','a','b','a','b','a','b','a','c','d','b','a','d'};

        assertEquals ("current state is update, current date is 2/1/2000 and current time is 2:0", question3.clock( a ));
        assertEquals ("current state is alarm, current date is 1/3/2001 and current time is 0:0", question3.clock( b ));
        assertEquals ("current state is normal, current date is 1/1/2000 and current time is 1:1", question3.clock( c ));
        assertEquals ("current state is update, current date is 1/1/2000 and current time is 0:0", question3.clock( d ));
        assertEquals ("current state is alarm, current date is 2/3/2002 and current time is 2:1", question3.clock( e ));
        assertEquals ("current state is normal, current date is 1/1/2002 and current time is 0:0", question3.clock( f ));
        assertEquals ("current state is normal, current date is 2/2/2001 and current time is 1:1", question3.clock( g ));
    }

}