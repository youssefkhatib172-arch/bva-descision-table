package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    private final CoinDecision coin = new CoinDecision();

    // R1 – 0 H → T,T,T,T → Negative
    @Test
    void R1_allTails_shouldReturnNegative() {
        String result = coin.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R2 – 1 H → H,T,T,T → Negative
    @Test
    void R2_oneHead_shouldReturnNegative() {
        String result = coin.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }

    // R3 – 2 H → H,H,T,T → Positive
    @Test
    void R3_twoHeads_shouldReturnPositive() {
        String result = coin.CoinDecision("H", "H", "T", "T");
        assertEquals("Positive", result);
    }

    // R4 – 3 H → H,H,H,T → Positive
    @Test
    void R4_threeHeads_shouldReturnPositive() {
        String result = coin.CoinDecision("H", "H", "H", "T");
        assertEquals("Positive", result);
    }

    // R5 – 4 H → H,H,H,H → Positive
    @Test
    void R5_fourHeads_shouldReturnPositive() {
        String result = coin.CoinDecision("H", "H", "H", "H");
        assertEquals("Positive", result);
    }
}
