import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestPriceTest {

    private BestPrice bestPrice;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void shouldTestCaseWhenPricesAlwaysGrows() {
        ApiCaller api = new ApiCaller(new int[] {1,2,3,4,5,6,7,8,9});
        bestPrice = new BestPrice(api);

        int bestDay = bestPrice.getBuyDay();
        assertEquals(0, bestDay);
    }

    @Test
    public void shouldTestCaseWhenPriceAlwaysGoesDown() {
        ApiCaller api = new ApiCaller(new int[] {9,8,7,6,5,4,3,2,1});
        bestPrice = new BestPrice(api);

        int bestDay = bestPrice.getBuyDay();
        assertEquals(0, bestDay);
    }

    @Test
    public void shouldGetBestDayToSell() {
        ApiCaller api = new ApiCaller(new int[] {1,2,3,4,5,6,7,8,9});
        bestPrice = new BestPrice(api);

        int bestDay = bestPrice.getSellDay();
        assertEquals(8, bestDay);
    }

    @Test
    public void shouldGetBestDayToSell2() {
        ApiCaller api = new ApiCaller(new int[] {1,5,1,3,1,8,0});
        bestPrice = new BestPrice(api);

        int bestDay = bestPrice.getSellDay();
        assertEquals(5, bestDay);
    }

}