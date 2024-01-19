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
    int[] prices = {7, 6, 4, 3, 1};

    Solution s = new Solution();
    int result = s.maxProfit(prices);
    assertEquals(result, 0);
  }

  @Test
  public void shouldCalculateBestTimeToBuyAndSell2() {
    int[] prices = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 20};

    Solution s = new Solution();
    int result = s.maxProfit(prices);
    assertEquals(result, 19);
  }

  @Test
  public void shouldCalculateBestTimeToBuyAndSell3() {
    int[] prices = {885,1,290,892,316,799,642,292,107,889,497,330,231,738,420,37,807,241,417,964,736,834,618,265,389,763,378,830,840,131,495,271,707,502,148,561,644,484,868,53,936,186,35,219,8000,84,455,971,922,862,434,553,948,857,491,622,162,934,66,486,569,690,596,506,452,635,690};

    Solution s = new Solution();
    int result = s.maxProfit(prices);
    assertEquals(result, 7999);
  }

}