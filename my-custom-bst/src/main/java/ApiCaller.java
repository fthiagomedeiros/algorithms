public class ApiCaller {


    public int getNumDays() {
        return 9;
    }

    public int getPriceOnDay(int day) {
        int[] days = new int[] {1,2,3,4,5,-3,7,8,9};
        return days[day];
    }
}
