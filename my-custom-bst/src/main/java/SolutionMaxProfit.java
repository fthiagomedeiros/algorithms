import static java.lang.Integer.MIN_VALUE;

public class SolutionMaxProfit {

    public int maxProfit(int[] prices) {
        // Initialize minPrice to the maximum possible value to track the minimum price encountered so far.
        int minPrice = Integer.MAX_VALUE;

        // Initialize maxProfit to zero because we want to find the maximum positive profit.
        int maxProfit = MIN_VALUE;

        // Iterate over each price in the prices array.
        for (int price : prices) {
            // Update the minimum price if the current price is lower than the current minimum.
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate the potential profit by subtracting the minimum price from the current price.
            int potentialProfit = price - minPrice;

            // Update the maximum profit if the potential profit is greater than the current maximum.
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }

        // Return the maximum profit found.
        return maxProfit;
    }

    public int minimumLoss(int[] prices) {
        // Initialize minPrice to the maximum possible value to track the minimum price encountered so far.
        int minPrice = Integer.MAX_VALUE;
        int nextPrice = 0;

        // Initialize maxProfit to zero because we want to find the maximum positive profit.
        int maxProfileOrMinimumLoss = MIN_VALUE;

        // Iterate over each price in the prices array.
        for (int i = 0; i < prices.length - 1; i++) {
            // Update the minimum price if the current price is lower than the current minimum.
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                nextPrice = prices[i+1];
            }

            // Calculate the potential profit by subtracting the minimum price from the current price.
            int potentialProfit = (nextPrice - prices[i]);

            // Update the maximum profit if the potential profit is greater than the current maximum.
            if (potentialProfit > maxProfileOrMinimumLoss) {
                maxProfileOrMinimumLoss = potentialProfit;
            }
        }

        // Return the maximum profit found or minimum loss.
        return maxProfileOrMinimumLoss;
    }

    public static void main(String[] args) {
        int[] values = new int[]{983, 1, 957, 541, 470, 660, 118, 742, 334, 822, 165, 145, 730, 656,
            567, 25, 684, 113, 351, 295, 468, 918, 587, 4, 399, 220, 11, 222, 777, 127, 135, 688,
            267, 570, 342, 748, 382, 428, 340, 35, 896, 846, 376, 655, 147, 891, 198, 420, 729, 685,
            989, 543, 285, 822, 254, 878, 380, 758, 490, 73, 870, 328, 234, 489, 990, 387, 688, 12,
            795, 746, 275, 371, 321, 298, 186, 925, 845, 816, 775, 647, 379, 15, 602, 756, 619,
            10000};

        int[] values3 = new int[]{2, 5, 3, 1, 10};
        int[] values4 = new int[]{10,5,2,1};
        int[] values5 = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] values6 = new int[]{10,9,8,7,6,5,4,5,3,2,1};

        SolutionMaxProfit s = new SolutionMaxProfit();
        System.out.println(s.minimumLoss(values3));
        System.out.println(s.minimumLoss(values4));
        System.out.println(s.minimumLoss(values5));
        System.out.println(s.minimumLoss(values6));
    }
}