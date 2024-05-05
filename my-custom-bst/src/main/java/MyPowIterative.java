public class MyPowIterative {

    //    https://leetcode.com/problems/powx-n/
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }

        if (x == 1 || x == -1) {

            if (x == -1 && n % 2 != 0) {
                return -1;
            }

            return 1;
        }

        boolean negative = false;
        if (n < 0) {
            negative = true;
            n = n * -1;
        }

        if (n == Integer.MIN_VALUE && negative) {
            return 0.0;
        }

        double finalResult = 1;
        while (n > 0) {
            finalResult = finalResult * x;
            n--;
        }

        if (negative) {
            finalResult = 1 / finalResult;
        }
        return finalResult;
    }

}