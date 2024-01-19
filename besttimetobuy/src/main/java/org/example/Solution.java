package org.example;

import java.util.Arrays;
import java.util.OptionalInt;

class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int numberOfdays = prices.length;

        for (int i = 0; i < numberOfdays; i++) {

            OptionalInt maxValueFromIndex = Arrays
                .stream(Arrays.copyOfRange(prices, i+1, numberOfdays))
                .max();

            int maxValue = maxValueFromIndex.isPresent() ?
                maxValueFromIndex.getAsInt() : -1;
            int dayValue = prices[i];

            if (dayValue > maxValue) {
            } else {
                int profit = maxValue - dayValue;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    private int[] copyOfRangeInt(int[] original, int from, int to) {
        int newLength = to - from;
        int[] copy = new int[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }
}