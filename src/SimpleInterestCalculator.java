import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
//        Initialise an instance of Scanner class to get input from stdin(keyboard)
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount(₹[Rupees].P[Paise]): ");
        float principal = in.nextFloat();
        System.out.print("Enter the loan period (in years): ");
        int years = in.nextInt();
        System.out.print("Enter the rate of interest(in %): ");
        float rateOfInterest = in.nextFloat();

//        Check for invalid inputs and get a valid input from the user.
        while ((principal <= 0 || years <= 0 || rateOfInterest < 0) ) {
            System.out.println("***** Seems like you have entered invalid input for few mandatory inputs *****");
            System.out.println("==== Please enter valid input OR Enter `-1` for any of the further inputs to EXIT the program ====");

            if(principal <= 0) {
                System.out.print("Invalid principal amount, Enter any valid positive number: ");
                principal = in.nextFloat();
            }

            if(years <= 0) {
                System.out.print("Invalid years, Enter any valid positive number: ");
                years = in.nextInt();
            }

            if(rateOfInterest < 0) {
                System.out.print("Invalid rate of interest, Enter any valid positive number: ");
                rateOfInterest = in.nextFloat();
            }

            if((int)principal == -1 || years == -1 || (int)rateOfInterest == -1) {
                break;
            }
        }

        if((int)principal == -1 || years == -1 || (int)rateOfInterest == -1) {
//            Message to user when user doesn't wish to continue with valid inputs.
            System.out.println("Thank You !! Come back soon !!");
        } else {
            System.out.println("Simple Interest(₹[Rupees].P[Paise]): " + calculateSimpleInterest(principal, years, rateOfInterest));
        }

    }

    /**
     *
     * @param principal The principal amount
     * @param years The load period in years
     * @param rateOfInterest The rate of interest
     * @return The Simple Interest amount
     */
    static float calculateSimpleInterest(float principal, int years, float rateOfInterest) {
        if(principal <= 0 || years <= 0 || rateOfInterest <= 0) {
            return 0.0f;
        }

        return (principal * years * rateOfInterest) / 100;
    }
}
