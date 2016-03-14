import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class RecursionTest {
    @Test
    public void factorial0(){
        Factorial f= new Factorial ();
       int result = f.Calculate(1);
        assertEquals(1,result);
    }
    @Test
    public void factorial1(){
        Factorial f= new Factorial ();
        int result = f.Calculate(0);
        assertEquals(1,result);
    }
    @Test
    public void factorial2(){
        Factorial f= new Factorial ();
        int result = f.Calculateif(4);
        assertEquals(2,result);
    }
}