import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string to check whether its a palindrome: ");
        String source = in.nextLine();

        boolean isSourcePalindrome = isPalindrome(source);

        if(isSourcePalindrome) {
            System.out.println("The string `" + source + "` is a PALINDROME");
        } else {
            System.out.println("The string `" + source + "` is NOT a PALINDROME");
        }
    }


    /**
     *
     * @param source String to check for palindrome.
     * @return `true` if the string is a palindrome or `false`.
     */
    static boolean isPalindrome(String source) {
        source = source.toLowerCase();
        source = source.replaceAll("\\s*", "");
        String reveresedString = reverseString(source);

        return reveresedString.equalsIgnoreCase(source);
    }

    /**
     *
     * @param source String to reverse
     * @return Revered string
     */
    static String reverseString(String source) {
        String reveresedString = "";

        for(char character: source.toCharArray()) {
            reveresedString = character + reveresedString;
        }

        return reveresedString;
    }
}
