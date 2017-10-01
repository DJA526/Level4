package palindromes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

	@Test
	public void testNull() {
		assertFalse(Palindromes.isPalindrome(null));
	}
	
	@Test
	public void testEmpty() {
		assertTrue(Palindromes.isPalindrome(""));
	}
	
	@Test
	public void testNonEmpty() {
		assertFalse(Palindromes.isPalindrome("ab"));
	}
	
	@Test
	public void testPalindrome() {
		assertTrue(Palindromes.isPalindrome("racecar"));
		assertFalse(Palindromes.isPalindrome("roar"));
		assertFalse(Palindromes.isPalindrome("ababba"));
		assertTrue(Palindromes.isPalindrome("Racecar"));
		assertTrue(Palindromes.isPalindrome("race car"));
		assertTrue(Palindromes.isPalindrome("Madam, I'm Adam"));
	}

}
