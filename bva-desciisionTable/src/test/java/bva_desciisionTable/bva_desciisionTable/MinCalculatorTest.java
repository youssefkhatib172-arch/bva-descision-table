package bva_desciisionTable.bva_desciisionTable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {
    
	 @Test
	    void testAIsZero_shouldThrowException() {
	        // arrange
	        int a = 0;   // ערך לא חוקי
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act + assert
	        assertThrows(IllegalArgumentException.class, () -> {
	        	MinCalculator.findMin(a, b, c, d, e);
	        });
	    }

	 @Test
	    void testAIsOne_shouldReturnMinimum() {
	        // arrange
	        int a = 10;    // ערך גבול תקין
	        int b = 50;
	        int c = 50;
	        int d = 50;
	        int e = 50;

	        // act
	        int result = MinCalculator.findMin(a, b, c, d, e);

	        // assert
	        assertEquals(10, result);   // 1 הוא הערך המינימלי
	    }
}
