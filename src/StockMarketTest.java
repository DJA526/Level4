import static org.junit.Assert.*;

import org.junit.Test;

public class StockMarketTest {

	@Test
	public void test() {
		double[] prices = {1.25, 3.74, 9.32, 5.29, 5.25, 4.21, 3.46, 8.12, 5.23};
		double[] bestPrices = StockMarket.findBestPrices(prices);
		assertTrue(bestPrices[0] == 1.25);
		assertTrue(bestPrices[1] == 9.32);
	}

}
