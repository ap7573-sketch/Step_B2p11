import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=================================");
        System.out.println("        PALINDROME CHECKER       ");
        System.out.println("=================================");
        System.out.println("Version: 1.0");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("=================================");

        // UC5: Stack-Based Palindrome Checker
        String word = "madam";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
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