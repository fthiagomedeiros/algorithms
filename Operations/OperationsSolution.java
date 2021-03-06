interface Operation {
    boolean check(int number);
}

class Number {
    public boolean checker(Operation operation, int number) {
        return operation.check(number);
    }

    public Operation isOdd() {
        return number -> number % 2 != 0;
    }

    public Operation isPalindrome() {
        return number -> {
            String n = String.valueOf(number);
            int lastPosition = n.length() - 1;
            for (int i = 0; i < (n.length()/2); i++) {
                if (n.charAt(i) == n.charAt(lastPosition)) {
                    lastPosition--;
                } else {
                    return false;
                }
            }
            return true;
        };
    }
}

public class Solution {
    public static void main(String[] args) {
        Number number = new Number();
        String answer = null;

            int conditionToCheck = 2;
            int numberToCheck = 10;

            if (conditionToCheck == 1) {
                Operation operation = number.isOdd();
                boolean result = number.checker(operation, numberToCheck);
                answer = result ? "ODD" : "EVEN";
            } else if (conditionToCheck == 2) {
                Operation operation = number.isPalindrome();
                boolean result = number.checker(operation, numberToCheck);
                answer = result ? "PALINDROME" : "NOT PALINDROME";
            }

            System.out.println(answer);
        }
    }