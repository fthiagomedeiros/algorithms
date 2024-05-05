public class MyPowChatGPT {

    /**
     * Fast exponentiation: The function uses a while loop in the fastPow method, which applies fast
     * exponentiation. In each iteration, it squares the base and halves the exponent. If the
     * current exponent is odd, it multiplies the result with the base. This allows the function to
     * efficiently calculate the result in O(log n) time complexity.
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        // Handle base cases
        if (x == 1) {
            return 1.0;
        } else if (x == -1) {
            return n % 2 == 0 ? 1.0 : -1.0;
        }

        // Check if exponent is zero
        if (n == 0) {
            return 1.0;
        }

        // Convert n to a positive integer and keep track if it was originally negative
        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        return fastPow(x, exp);
    }

    // Helper function to calculate x raised to the power exp using fast exponentiation
    private double fastPow(double x, long exp) {
        double result = 1.0;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result *= x;
            }
            x *= x;
            exp /= 2;
        }
        return result;
    }
}
