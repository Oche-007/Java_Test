import org.junit.Test;

import com.example.TestStringUtils;

import static org.junit.Assert.*;

public class TestStringUtilsTest {
    
    @Test
    public void testIsPrime() {
        assertTrue(NumberStringUtils.isPrime(5));
        assertTrue(NumberStringUtils.isPrime(11));
        assertTrue(NumberStringUtils.isPrime(18));
        assertTrue(NumberStringUtils.isPrime(23));
                
        assertFalse(NumberStringUtils.isPrime(105));
      
    }
    
    @Test
    public void testIsPalindrome() {        
        assertTrue(NumberStringUtils.isPalindrome("level"));
        assertTrue(NumberStringUtils.isPalindrome("Was it a car or a cat I saw"));

        assertFalse(NumberStringUtils.isPalindrome("java"));
   
        assertFalse(NumberStringUtils.isPalindrome(null));
    }
} 

