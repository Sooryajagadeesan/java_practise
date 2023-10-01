import java.util.Scanner;
public class RupeesToUSDConverter {
    public static void main(String[] args) {
//        Instantiate Scanner class to get inputs from stdin(keyboard)
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount(₹[Rupees].P[Paise]): ");
        float rupees = in.nextFloat();

//        When the entered `rupees` is negative, Prompt the user for a valid input.
        while(rupees < 0) {
            System.out.println("Oops! Currency cannot be negative, Please enter any non-negative value");
            rupees = in.nextFloat();
        }

        float USDValue = convertRupeesToUSD(rupees);

        System.out.println("USD value of ₹" + rupees + " is $" + USDValue);
    }

    static float convertRupeesToUSD(float rupees) {
        /*
            1 USD = 83.04 Rupees, as of 01.10.2023
         */
        return rupees / 83.04f;
    }
}
