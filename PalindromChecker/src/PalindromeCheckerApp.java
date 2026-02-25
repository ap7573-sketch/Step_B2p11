public class PalindromeCheckerApp {

    public static boolean isPalindrome(String word) {

        // Step 1: Normalize string
        String normalized = word.replaceAll("\\s+", "")   // remove spaces
                .toLowerCase();            // ignore case

        int start = 0;
        int end = normalized.length() - 1;

        // Step 2: Apply two-pointer logic
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "Madam In Eden Im Adam";

        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }
}