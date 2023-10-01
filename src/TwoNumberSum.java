import java.util.Scanner;
public class TwoNumberSum {
    public static void main(String[] args) {
//        Instantiate Scanner class to get inputs from stdin(keyboard)
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float number1 = in.nextFloat();

        System.out.print("Enter number 2: ");
        float number2 = in.nextFloat();

//        Print sum of the `Two numbers`
        float sum = add(number1, number2);
        System.out.println("Sum of " + number1 + ", " + number2 + " is " + sum);
    }

    /**
     *
     * @param numbers The numbers to add - Variable length arguments.
     * @return The sum of the numbers.
     */
    static float add(float ...numbers) {
        int sum = 0;
        for(float number: numbers) {
            sum += number;
        }

        return sum;
    }
}
