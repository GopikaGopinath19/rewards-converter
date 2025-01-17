import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {
     // Set an appropriate delta value

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        double milesValue = 10000;
        var rewardValue = new RewardValue(milesValue,true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double expectedMilesValue = cashValue/RewardValue.CONVERSION_RATE;
        var rewardValue= new RewardValue(cashValue);
        assertEquals(expectedMilesValue,rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        double expectedCashValue = milesValue*RewardValue.CONVERSION_RATE;
        var rewardValue = new RewardValue(milesValue,true);
        assertEquals(expectedCashValue,rewardValue.getCashValue());

    }
}
