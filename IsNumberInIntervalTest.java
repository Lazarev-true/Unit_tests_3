import org.junit.jupiter.api.Test;
import static main.HW.Main.isNumberInInterval;
import static org.junit.jupiter.api.Assertions.*;


public class IsNumberInIntervalTest {
    @Test
    public void lowerNumberTest(){
        assertFalse(isNumberInInterval(25));
    }

    @Test
    public void higherNumberTest(){
        assertFalse(isNumberInInterval(100));
    }
    @Test
    public void minNumberInIntervalTest(){
        assertTrue(isNumberInInterval(26));
    }
    @Test
    public void maxNumberInIntervalTest(){
        assertTrue(isNumberInInterval(99));
    }
    @Test
    public void middleNumberInIntervalTest(){
        assertTrue(isNumberInInterval(50));
    }
}
