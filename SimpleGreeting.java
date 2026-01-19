//simpleGreeting.java
// on 1/12/25

import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String [] args) {
        System.out.println("\n\n****** Welcome to my Simple Greeting Program! ****\n\n");

        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Create a String variable to hold our user's name.
        String myUserName;

        // Prompt the user for their name.
        System.out.println("\n Please enter your name: ");

        // Get the input into our variable
        myUserName = scanner.nextLine();

        // Prove that you got the user name.
        System.out.println("\n Hello " + myUserName + " how are you today?");
    }
}
