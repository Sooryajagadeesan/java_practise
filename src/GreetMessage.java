import java.util.Calendar;
import java.util.Scanner;
public class GreetMessage {
    public static void main(String[] args) {
//        Initialise an instance of the Scanner class to get input from the stdin(keyboard)
        Scanner in = new Scanner(System.in);

//        Input a name which is of type `String`.
        /*
         * NOTE: nextLine() method is used since names may be in parts(eg, first name, middle name, last name)
         */
        System.out.print("Enter a name to greet: ");
        String name = in.nextLine().trim();

        /*
         * When the length of the name is < 3 characters,
         * Keep prompting the user to input a valid name with at least 3 characters long
         * When the user does not wish to proceed with a valid name he/she can enter `XXX` string and exit the program, at this time the user will be shown a `Thank You` message.
         */
        while(name.length() < 3 && !name.equalsIgnoreCase("XXX")) {
            System.out.println("Oops !! Invalid name, A name must be at least 3 characters long");
            System.out.println("Please Enter a valid name to proceed or process XXX to exit");
            name = in.nextLine().trim();
        }

        if(!name.equalsIgnoreCase("XXX")) {
            //        Get greet message for this user.
            String greetMessage = getGreetMessage(name);

            //        Print the greet message
            System.out.println(greetMessage);
        } else {
            System.out.println("Thank you !!");
        }
    }

    /**
     *
     * @param name The name of the subject to be greeted.
     * @return The greet message as `String` type.
     *
     * TODO: The `name` must be converted to `Title case` so that `UNEVEN casing` in the user input will be handled.
     */
    static String getGreetMessage(String name)  {
//        Remove empty characters at the start and end of the `name` variable.
        name = name.trim();

//        Get an instance of `Calendar` class to get the current hour of the day.
        Calendar calendarInstance = Calendar.getInstance();

//        Get the hour of the day
        int hourOfTheDay = calendarInstance.get(Calendar.HOUR_OF_DAY);

//        A variable to store the `Greet message based on time`
        String greetMessageAsPerTime = "";

//        Generate the greet message based on time.
        if(hourOfTheDay <= 11) {
//            Hours from 0 to 11 is considered as `Morning`
            greetMessageAsPerTime = "Good Morning !!";
        } else if(hourOfTheDay <= 15) {
//            Hours from 12 to 15 is considered as `Afternoon`
            greetMessageAsPerTime = "Good Afternoon !!";
        } else if(hourOfTheDay <= 19){
//            Hours from 16 to 19 is considered as `Evening`
            greetMessageAsPerTime = "Good Evening !!";
        } else {
//            Hours from 20 to 23 is considered as `Late Evening`
            greetMessageAsPerTime = "Happy Late Evening !!";
        }

//        When the name is a valid string (non-empty characters), Greet with name.
        if(name.length() > 0) {
            return "Hi " + name + ", " + greetMessageAsPerTime;
        }

//        When name is empty, Greet without name.
        return "Hi, " + greetMessageAsPerTime;
    }
}
