import java.util.*;

// 1️⃣ Strategy Interface
interface PalindromeStrategy {
    boolean check(String word);
}


// 2️⃣ Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (char c : word.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


// 3️⃣ Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}


// 4️⃣ Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String word) {
        return strategy.check(word);
    }
}


// 5️⃣ Main Application Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // To switch algorithm, replace with:
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.execute(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}