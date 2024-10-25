import java.util.Scanner;

public class string2 {
    public static String replace(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            boolean isRepeated = false;

            // Check if the character has already appeared earlier in the word
            for (int j = 0; j < i; j++) {
                if (word.charAt(j) == currentChar) {
                    isRepeated = true;
                    break;
                }
            }

            // If the character is repeated, replace with '*', else add the character
            if (isRepeated) {
                result.append('X');
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Process the word
        String result = replace(word);

        // Display the result
        System.out.println("Answer: " + result);
    }
}
