import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER       ");
        System.out.println("=================================");
        System.out.println("Version: 1.0");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("=================================");

        // UC6: Queue + Stack Based Palindrome Check
        String word = "level";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters
        for (char c : word.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}