import java.util.*;

public class PalindromeCheckerApp {

    // 1️⃣ Two Pointer Method
    public static boolean twoPointerCheck(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // 2️⃣ Stack Method
    public static boolean stackCheck(String word) {

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

    // 3️⃣ Deque Method
    public static boolean dequeCheck(String word) {

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

    public static void main(String[] args) {

        String word = "madam";

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(word);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("Two Pointer → Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack       → Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque       → Result: " + result3 + " | Time: " + time3 + " ns");
    }
}