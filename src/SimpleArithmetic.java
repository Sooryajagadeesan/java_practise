import java.util.Scanner;
public class SimpleArithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float number1 = in.nextFloat();
        System.out.print("Enter number 2: ");
        float number2 = in.nextFloat();
        System.out.println("Enter operation to perform(+, -, *, /)");
        printOperationInstructions();

        char operationToPerform = in.next().trim().charAt(0);

        while(operationToPerform != '+' && operationToPerform != '-' && operationToPerform != '*' && operationToPerform != '/') {
            System.out.println("**** Oops! Invalid operation *****");
            printOperationInstructions();

            operationToPerform = in.next().charAt(0);
        }

        float result = 0;
        if(operationToPerform == '+') {
            result = add(number1, number2);
        } else if(operationToPerform == '-') {
            result = subtract(number1, number2);
        } else if(operationToPerform == '*') {
            result = multiply(number1, number2);
        } else if(operationToPerform == '/') {
            result = division(number1, number2);
        }

        System.out.println("The result is, " + result);
    }

    /**
     *
     * @param numbers The Numbers to add - Variable length arguments
     * @return The sum of the numbers.
     */
    static float add(float ...numbers) {
        float sum = 0;

        for(float number: numbers) {
            sum += number;
        }

        return sum;
    }

    /**
     *
     * @param minuend The number to subtract from.
     * @param subtrahend The number to subtract.
     * @return The difference after subtracting the `subtrahend` from the `minuend`.
     */
    static float subtract(float minuend, float subtrahend) {
        return minuend - subtrahend;
    }

    /**
     *
     * @param numbers The Numbers to multiply - Variable length arguments
     * @return The product of the numbers
     */
    static float multiply(float ...numbers) {
        float product = 1;

        for(float number: numbers) {
            product *= number;
        }

        return product;
    }

    /**
     *
     * @param dividend The number to divide.
     * @param divisor The number to divide by.
     * @return The result after dividing the dividend with the divisor
     */
    static float division(float dividend, float divisor) {
        return dividend / divisor;
    }

    /**
     * Prints the available operation instructions while getting input for `operation to perform`
     */
    static void printOperationInstructions() {
        System.out.println("Please enter any 1 among the below");
        System.out.println("Enter + for Performing addition");
        System.out.println("Enter - for Performing subtraction");
        System.out.println("Enter * for Performing multiplication");
        System.out.println("Enter / for Performing division");
    }
}
