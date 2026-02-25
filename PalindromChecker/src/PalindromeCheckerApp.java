public class PalindromeCheckerApp {

    // Method to check palindrome after preprocessing
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Remove all spaces using regex
        String normalized = input.replaceAll("\\s+", "")
                .toLowerCase();

        // Step 2: Apply two-pointer logic
        int start = 0;
        int end = normalized.length() - 1;

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