public class BestPrice {

    private ApiCaller api;

    public BestPrice(ApiCaller api) {
        this.api = api;
    }

    //should validate corner cases
    //Linear O(n)
    public int getBuyDay() {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int dayToBuy = 0;

        for (int day = 0; day < api.getNumDays(); day++) {
            int priceCurrentDay = api.getPriceOnDay(day);

            if (priceCurrentDay < minPrice) {
                minPrice = priceCurrentDay;
                dayToBuy = day;
            }

            // Calculate the potential profit by subtracting the minimum price from the current price.
            int potentialProfit = priceCurrentDay - minPrice;

            // Update the maximum profit if the potential profit is greater than the current maximum.
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }

        }
        return dayToBuy;
    }

    //Linear O(n)
    public int getSellDay() {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int dayToSell = 0;

        for (int day = 0; day < api.getNumDays(); day++) {
            int priceCurrentDay = api.getPriceOnDay(day);

            if (priceCurrentDay < minPrice) {
                minPrice = priceCurrentDay;
            }

            // Calculate the potential profit by subtracting the minimum price from the current price.
            int potentialProfit = priceCurrentDay - minPrice;

            // Update the maximum profit if the potential profit is greater than the current maximum.
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
                dayToSell = day;
            }

        }
        return dayToSell;
    }

}
