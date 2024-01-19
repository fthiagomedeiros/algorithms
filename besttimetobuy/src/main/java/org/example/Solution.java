package org.example;

import java.util.Arrays;

class Solution {

  public int maxProfit(int[] prices) {
    int numberOfDays = prices.length;

    if (numberOfDays <= 1) {
      return 0;
    }

    int[] maxProfitArray = new int[numberOfDays];
    int minPrice = prices[0];

    for (int i = 1; i < numberOfDays; i++) {
      int currentPrice = prices[i];

      // Updates the minimum
      minPrice = Math.min(minPrice, currentPrice);

      // Calculates the profit to sell on day + 1
      int potentialProfit = currentPrice - minPrice;

      // Updates the max profit until the day
      maxProfitArray[i] = Math.max(maxProfitArray[i - 1], potentialProfit);
    }

    return maxProfitArray[numberOfDays - 1];
  }

  private int[] copyOfRangeInt(int[] original, int from, int to) {
    int newLength = to - from;
    int[] copy = new int[newLength];
    System.arraycopy(original, from, copy, 0,
        Math.min(original.length - from, newLength));
    return copy;
  }
}