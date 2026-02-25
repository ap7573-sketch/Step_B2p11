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

        // UC7: Deque-Based Optimized Palindrome Checker
        String word = "radar";

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
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