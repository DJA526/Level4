
public class StockMarket {
	
	public static double[] findBestPrices(double[] prices) {
		double buy = 0;
		double sell = 0;
		double difference = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				if (prices[j] - prices[i] > difference) {
					difference = prices[j] - prices[i];
					buy = prices[i];
					sell = prices[j];
				}
			}
		}
		double[] bestPrices = {buy, sell};
		return bestPrices;
	}

}
