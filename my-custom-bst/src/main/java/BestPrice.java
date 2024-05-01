public class BestPrice {

    private ApiCaller api;

    public BestPrice(ApiCaller api) {
        this.api = api;
    }

    public int getBuyDay() {

        int dayToBuy = Integer.MIN_VALUE;
        int MAX_PRICE_FOUND = Integer.MIN_VALUE;

        for (int day = 0; day < api.getNumDays() - 2; day++) {
            int priceCurrentDay = api.getPriceOnDay(day);

            for (int j = day + 1; j < api.getNumDays() - 1; j++) {
                int nextDaysPrice = api.getPriceOnDay(j);

                String key = day + "-" + j + " " + (nextDaysPrice - priceCurrentDay);
                System.out.println(key);
                int price = nextDaysPrice - priceCurrentDay;

                if (price > MAX_PRICE_FOUND) {
                    MAX_PRICE_FOUND = price;
                    dayToBuy = day;
                }
            }
        }
        return dayToBuy;
    }

    public int getSellDay() {
        int dayToSell = Integer.MIN_VALUE;
        return -1;
    }

}
