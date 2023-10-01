import java.lang.Math;
import java.util.Scanner;

public class NumberLengthCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to find its length: ");
        int number = in.nextInt();
        int numberLength = findLengthOfNumber(number);
        System.out.println("Length of the number " + number + " is " + numberLength);
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
