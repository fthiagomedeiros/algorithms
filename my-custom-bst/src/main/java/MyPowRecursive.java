public class MyPowRecursive {

    //    https://leetcode.com/problems/powx-n/
    public double myPow(double x, int n) {

        if (n == 0) {
            return 1;
        }

        double finalResult = myPow(x, n < 0 ? (n * -1)-1 : --n, n < 0) * x;

        if (n < 0) {
            return 1 / finalResult;
        }

        return finalResult;
    }

    private double myPow(double x, int n, boolean isNegative) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }

        return myPow(x, --n, isNegative) * x;
    }

}