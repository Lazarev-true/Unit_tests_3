import org.junit.jupiter.api.Test;
import static main.HW.Main.isEvenNumber;
import static org.junit.jupiter.api.Assertions.*;

public class IsEvenNumberTest {

    @Test
    public void isEvenNumberTrueTest(){
        int evenNumber = 10;
        assertTrue(isEvenNumber((evenNumber)));
    }

    @Test
    public void isEvenNumberFalseTest() {
        int oddNumber = 11;
        assertFalse(isEvenNumber((oddNumber)));
    }
}
