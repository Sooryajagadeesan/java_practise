import java.util.Scanner;
import java.util.Arrays;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the fibonacci series: ");
        int limit = in.nextInt();

//        When the user enters a negative number for limit, Prompt the user of a valid non-negative number for limit
        while(limit < 0) {
            System.out.println("Oops! Invalid limit value, Please enter a non-negative limit value");
            limit = in.nextInt();
        }

        int[] fibonacciSeries = generateFibonacciSeries(limit);
        System.out.println("Fibonacci series of size " + limit + ": " + Arrays.toString(fibonacciSeries));
    }

    static int[] generateFibonacciSeries(int limit) {
        if(limit <= 0) {
//            Return an empty array when the limit value is less than or equal to 0
            return new int[]{};
        }

        int[] fibonacciSeries = new int[limit];
        int first = 0;

        fibonacciSeries[0] = first;
        if (limit == 1) {
//            Return the array with 1 value when the limit is 1
            return fibonacciSeries;
        }

        int second = 1;
        fibonacciSeries[1] = second;
        int startIndex = 2;

//        The below loop will execute when the limit value is greater than 2.
        while (startIndex < limit) {
            int next = first + second;
            first = second;
            second = next;

            fibonacciSeries[startIndex] = next;
            startIndex++;
        }

        return fibonacciSeries;
    }
}
