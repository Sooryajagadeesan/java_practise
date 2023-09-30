import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
//        Initialise an instance of Scanner class to get input from stdin(keyboard)
        Scanner in = new Scanner(System.in);

//        Get an integer input using stdin(keyboard)
        System.out.print("Enter a number to check whether its ODD or EVEN: ");
        int number = in.nextInt();

//        Print whether the input number is either ODD or EVEN
        printOddOrEven(number);

//        Print whether a number is ODD or EVEN here after checking whether a number is ODD or EVEN in a separate method
        boolean isNumberOdd = isOdd(number);

        if(isNumberOdd) {
            System.out.println(number + " is ODD");
        } else {
            System.out.println(number + " is EVEN");
        }
    }

    /**
      * @param number An integer number
     */
    static void printOddOrEven(int number) {
        /**
         * Even number - If any number leaves a remainder of 0 when divided by 2 is called an even number.
         * Odd number - If any number leaves a remainder of 1 when divided by 2 is called an odd number.
         *
         * MISC: Does 0 an even or odd number ?
         *      A basic google search reveals that the `0 is even`. Lets stick to this.
         */

        if((number & 1) == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }

    /**
     *
     * @param number An integer number
     * @return `true` if number is ODD or `false` if number is EVEN
     */
    static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}
