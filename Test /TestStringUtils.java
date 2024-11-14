public class TestStringUtils {
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        // Convert to lowercase
        String processedStr = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = processedStr.length() - 1;
        
        while (start < end) {
            if (processedStr.charAt(start) != processedStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}




