package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCalculatorTest {

    // ======= BVA עבור המשתנה a =======

    // a = 0 → מחוץ לטווח → אמורה להיות שגיאה
    @Test
    void aMinMinus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
                MinCalculator.findMin(0, 50, 50, 50, 50));
    }

    // a = 1 → גבול תחתון תקין לפי הדרישה (כאן מתגלה הבאג isOutOfRangeA)
    @Test
    void aMin_shouldReturn1() {
        int result = MinCalculator.findMin(1, 50, 50, 50, 50);
        assertEquals(1, result);
    }

    // a = 2 → min+1
    @Test
    void aMinPlus1_shouldReturn2() {
        int result = MinCalculator.findMin(2, 50, 50, 50, 50);
        assertEquals(2, result);
    }

    // a = 999 → max-1, המינימום צריך להיות 50
    @Test
    void aMaxMinus1_shouldReturn50() {
        int result = MinCalculator.findMin(999, 50, 50, 50, 50);
        assertEquals(50, result);
    }

    // a = 1000 → max, המינימום עדיין 50
    @Test
    void aMax_shouldReturn50() {
        int result = MinCalculator.findMin(1000, 50, 50, 50, 50);
        assertEquals(50, result);
    }

    // a = 1001 → מחוץ לטווח → אמורה להיות שגיאה
    @Test
    void aMaxPlus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
                MinCalculator.findMin(1001, 50, 50, 50, 50));
    }

    // a = 500 → ערך נומינלי באמצע הטווח, המינימום הוא 50
    @Test
    void aNominal_shouldReturn50() {
        int result = MinCalculator.findMin(500, 50, 50, 50, 50);
        assertEquals(50, result);
    }

    // ======= BVA עבור המשתנה b =======

    // b = 0 → מחוץ לטווח → אמורה להיות שגיאה
    @Test
    void bMinMinus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
                MinCalculator.findMin(50, 0, 50, 50, 50));
    }

    // b = 1 → גבול תחתון תקין
    @Test
    void bMin_shouldReturn1() {
        int result = MinCalculator.findMin(50, 1, 50, 50, 50);
        assertEquals(1, result);
    }

    // b = 2 → min+1
    @Test
    void bMinPlus1_shouldReturn2() {
        int result = MinCalculator.findMin(50, 2, 50, 50, 50);
        assertEquals(2, result);
    }

    // b = 999 → max-1, המינימום צריך להיות 50
    @Test
    void bMaxMinus1_shouldReturn50() {
        int result = MinCalculator.findMin(50, 999, 50, 50, 50);
        assertEquals(50, result);
    }

    // b = 1000 → max, המינימום עדיין 50 (כאן מתגלה הבאג isOutOfRangeB)
    @Test
    void bMax_shouldReturn50() {
        int result = MinCalculator.findMin(50, 1000, 50, 50, 50);
        assertEquals(50, result);
    }

    // b = 1001 → מחוץ לטווח → אמורה להיות שגיאה
    @Test
    void bMaxPlus1_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () ->
                MinCalculator.findMin(50, 1001, 50, 50, 50));
    }

    // b = 500 → ערך נומינלי, המינימום הוא 50
    @Test
    void bNominal_shouldReturn50() {
        int result = MinCalculator.findMin(50, 500, 50, 50, 50);
        assertEquals(50, result);
    }
}
