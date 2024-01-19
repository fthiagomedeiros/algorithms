package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

  @Test
  public void shouldCalculateBestTimeToBuyAndSell() {
    int[] prices = {7, 1, 5, 3, 6, 4};

    Solution s = new Solution();
    int result = s.maxProfit(prices);
    assertEquals(result, 5);
  }

  @Test
  public void shouldCalculateNoBestTimeToBuyAndSell() {
    int[] prices = {7,6,4,3,1};

    Solution s = new Solution();
    int result = s.maxProfit(prices);
    assertEquals(result, 0);
  }

    @Test
  public void shouldCalculateBestTimeToBuyAndSell2() {
    int[] prices = {1,2,3,4,5,6,7,8,9,10,1,20};

    Solution s = new Solution();
    int result = s.maxProfit(prices);
    assertEquals(result, 19);
  }

}