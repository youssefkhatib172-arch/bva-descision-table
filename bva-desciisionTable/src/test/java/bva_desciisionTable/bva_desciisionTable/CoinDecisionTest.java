package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    private final CoinDecision coin = new CoinDecision();

    // R1 / R2 – F,F,F,F → Negative
    @Test
    void R1_allFalse_shouldReturnNegative() {
        String result = coin.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R3 – F,T,F,F → Negative
    @Test
    void R3_FTFF_shouldReturnNegative() {
        String result = coin.CoinDecision("T", "H", "T", "T");
        assertEquals("Negative", result);
    }

    // R4 – F,F,T,F → Negative
    @Test
    void R4_FFTF_shouldReturnNegative() {
        String result = coin.CoinDecision("T", "T", "H", "T");
        assertEquals("Negative", result);
    }

    // R5 – F,F,F,T → Negative
    @Test
    void R5_FFFT_shouldReturnNegative() {
        String result = coin.CoinDecision("T", "T", "T", "H");
        assertEquals("Negative", result);
    }

    // R6 / R12 / R13 / R16 – T,T,F,F → Positive
    @Test
    void R6_TTFF_shouldReturnPositive() {
        String result = coin.CoinDecision("H", "H", "T", "T");
        assertEquals("Positive", result);
    }

    // R7 / R14 – T,F,T,F → Positive
    @Test
    void R7_TFTF_shouldReturnPositive() {
        String result = coin.CoinDecision("H", "T", "H", "T");
        assertEquals("Positive", result);
    }

    // R8 – T,F,F,T → Positive
    @Test
    void R8_TFFT_shouldReturnPositive() {
        String result = coin.CoinDecision("H", "T", "T", "H");
        assertEquals("Positive", result);
    }

    // R15 / R9 – F,T,T,F → Positive
    @Test
    void R9_FTTF_shouldReturnPositive() {
        String result = coin.CoinDecision("T", "H", "H", "T");
        assertEquals("Positive", result);
    }

    // R10 – F,T,F,T → Positive
    @Test
    void R10_FTFT_shouldReturnPositive() {
        String result = coin.CoinDecision("T", "H", "T", "H");
        assertEquals("Positive", result);
    }
}
