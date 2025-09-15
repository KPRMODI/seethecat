import java.util.Scanner;

public class StringAnalyzer {

    public static Scanner scanner = new Scanner(System.in);

        public static String getInput(String prompt) { // Gets string input
        System.out.print(prompt); //Gets input
        return scanner.nextLine();
    }


    public static void main(String[] args) {

        
        // Prompt the user to enter a full sentence
        // Store the sentence in a String variable
        String user_input = getInput("Enter a full sentence: ");

        // Print the number of characters in the sentence
        System.out.println("Number of characters in your sentence: " + user_input.length());
        

        // Print the first and last characters
        System.out.println("First Letter: " + user_input.charAt(0) + "And Last Letter: " + user_input.charAt(user_input.length()-1));

        // Print the sentence with whitespace removed from both ends
        System.out.println("All white spaces removed:" + user_input.trim());

        // Print the sentence in all uppercase
        System.out.println("All uppercase:" + user_input.toUpperCase());

        // Print the sentence in all lowercase
        System.out.println("All lowercase:" + user_input.toLowerCase());

        // Prompt the user to enter a single character
        String single_character = getInput("Enter a single character");

        // Determine if it is a letter, digit, or neither
         if (Character.isLetter(single_character.charAt(0))) {
            System.out.println("1");
         }
        // If it's a letter, check if it's uppercase or lowercase
        // Print the decimal code of the character

        // BONUS:
        // Prompt the user for a substring to search for
        // Display the index of the first occurrence or -1 if not found
    }
}
