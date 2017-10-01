package anagrams;

import static org.junit.Assert.*;

import java.util.HashMap;

import static anagrams.Anagrams.isAnagram;

import org.junit.Test;

public class AnagramsTest {

	@Test
	public void testNull() {
		assertTrue(isAnagram(null, null));
		assertFalse(isAnagram(null, ""));
		assertFalse(isAnagram("", null));
	}
	
	@Test
	public void testEmpty() {
		assertTrue(isAnagram("", ""));
		assertFalse(isAnagram("", "a"));
		assertFalse(isAnagram("a", ""));
	}
	
	@Test
	public void testMatchingStrings() {
		assertTrue(isAnagram("a", "a"));
		assertTrue(isAnagram("ab", "ab"));
		assertFalse(isAnagram("a", "ab"));
		assertFalse(isAnagram("ab", "a"));
		assertFalse(isAnagram("a", "b"));
		assertFalse(isAnagram("ab", "ac"));
	}
	
	@Test
	public void testMatchingStringsNonCaseSensitive() {
		assertTrue(isAnagram("a", "a"));
		assertTrue(isAnagram("ab", "ab"));
		assertFalse(isAnagram("a", "ab"));
		assertFalse(isAnagram("ab", "a"));
		assertFalse(isAnagram("a", "b"));
		assertFalse(isAnagram("ab", "ac"));
		assertTrue(isAnagram("A", "a"));
		assertTrue(isAnagram("aA", "Aa"));
	}
	
	@Test
	public void testToHashMap() {
		HashMap<Character, Integer> map = Anagrams.toHashMap("Hello");
		assertNotNull(map.get('H'));
		assertEquals(2, map.get('l').intValue());
		assertNull(map.get('x'));
		map = Anagrams.toHashMap("Hash");
		assertEquals(1, map.get('h').intValue());
	}
	
	@Test
	public void testToHashMapEmpty() {
		HashMap<Character, Integer> map = Anagrams.toHashMap(null);
		assertTrue(map.isEmpty());
	}
	

}