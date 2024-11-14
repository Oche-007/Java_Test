public class Main {
    public static void main(String[] args) {
        // Check if numbers are prime
        int[] testNumbers = {5, 11, 18, 23, 105};
        for (int num : testNumbers) {
            System.out.println(num + " is a prime number: " + NumberStringUtils.isPrime(num));
        }

        // Test for Palindrome
        String[] testStrings = {
            "level",
            "Was it a car or a cat I saw",
            "java",
            null
        };
        
        for (String str :  testStrings) {
            System.out.println("\"" + str + "\" is a palindrome: " + NumberStringUtils.isPalindrome(str));
        }
    }
}
