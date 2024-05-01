public class ApiCaller {

    private final int numberOfDays;
    private final int[] pricesOnDays;

    public ApiCaller(int[] pricesOnDays) {
        numberOfDays = pricesOnDays.length;
        this.pricesOnDays = pricesOnDays;
    }

    public int getNumDays() {
        return numberOfDays;
    }

    public int getPriceOnDay(int day) {
        return pricesOnDays[day];
    }
}
