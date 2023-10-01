import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter start limit(inclusive): ");
        int startLimit = in.nextInt();

        System.out.print("Enter end limit(inclusive): ");
        int endLimit = in.nextInt();

//        When the input is invalid, Prompt the user for valid inputs
        while(startLimit > endLimit || startLimit < 0 || endLimit <= 0) {
            if(startLimit > endLimit) {
                System.out.println("Invalid limit values, start limit must be less than end limit");

                System.out.print("Enter start limit(inclusive): ");
                startLimit = in.nextInt();

                System.out.print("Enter end limit(inclusive): ");
                endLimit = in.nextInt();
            }

            if(startLimit < 0) {
                System.out.println("Invalid start limit, start limit must be a positive value or 0");
                System.out.print("Enter start limit(inclusive): ");
                startLimit = in.nextInt();
            }

            if(endLimit <= 0) {
                System.out.println("Invalid end limit, end limit must be a positive value");
                System.out.print("Enter end limit(inclusive): ");
                endLimit = in.nextInt();
            }
        }

        ArrayList<Integer> armstrongNumbers = generateArmstrongNumbers(startLimit, endLimit);

        if(armstrongNumbers.size() > 0) {
            System.out.println("Armstrong numbers from " + startLimit + " to " + endLimit + " is " + armstrongNumbers);
        } else {
            System.out.println("Sorry!! There are NO armstrong numbers from " + startLimit + " to " + endLimit);
        }
    }

    /**
     *
     * @param startLimit The start limit to check for armstrong numbers.
     * @param endLimit The end limit to check for armstrong numbers.
     * @return An array list of available armstrong numbers between start limit and end limit.
     */
    static ArrayList<Integer> generateArmstrongNumbers(int startLimit, int endLimit) {
        ArrayList<Integer> armstrongNumbers = new ArrayList<>(10);

        for(int i = startLimit; i <= endLimit; i++) {
            if(isArmstrongNumber(i)) {
                armstrongNumbers.add(i);
            }
        }

        return armstrongNumbers;
    }

    /**
     *
     * @param number The number to check.
     * @return `true` if the number is `Armstrong` else `false`
     */
    static boolean isArmstrongNumber(int number) {
        if(number < 0) {
            return false;
        }

        if(number == 0) {
            return true;
        }

        int exponent = findLengthOfNumber(number);
        /*
         * Here the digits of the number are raised to the length of the number. So the below numbers will also be
         * considered as armstrong, 2, 3, 4, 5, 6, 7, 8, 9
         *
         * NOTE: If 2, 3, 4, 5, 6, 7, 8, 9 should be removed pls add an if condition above like,
         *
         * if(number > 1 && number <= 9) return false
         */
        return number == findSumOfDigits(number, exponent);
    }

    /**
     *
     * @param number The number whose sum of digits should be calculated.
     * @param exponent While finding the sum, Raise the digits of the number to this exponent.
     * @return The sum of the digits of the number
     */
    static int findSumOfDigits(int number, int exponent) {
        if(number < 0) {
            number = number * -1;
        }
        if(exponent < 0) {
            exponent = 1;
        }

        int sum = 0;
        while(number > 0) {
            int digit = number % 10;

            int value = 1;
            for(int i = 0; i < exponent; i++) {
                value = value * digit;
            }

            sum += value;
            number /= 10;
        }

        return sum;
    }

    /**
     *
     * @param number The number whose length is to be calculated.
     * @return The length of the number
     *
     * Take integral value of log base 10 of the number and add 1
     *
     * NOTE: For number 0, return 1 directly
     * NOTE: For negative numbers, convert them to positive and proceed with the above formula.
     */
    static int findLengthOfNumber(int number) {
        if(number == 0) {
            return 1;
        }

        if(number < 0) {
            number = number * -1;
        }

        return (int)Math.log10(number) + 1;
    }
}
