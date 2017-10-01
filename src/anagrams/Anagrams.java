package anagrams;

import java.util.HashMap;

public class Anagrams {
	
	public static boolean isAnagram0(String s1, String s2) {		
		boolean b = true;
		
		// Null or Empty Cases
		if (s1==null) {
			b = s2==null;
		} else if (s2==null) {
			b = s1==null;
		} else if (s1.equals("")) {
			b = s2.equals("");
		} else if (s2.equals("")) {
			b = s1.equals("");
		} 
		
		// Strings of different lengths
		else if (s1.length() != s2.length()) {
			b = false;
		}
		
		// Strings
		else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			for (int i = 0; i < s1.length(); i++) {
				if (!s2.contains(s1.substring(i, i + 1))) {
					b = false;
				} else {
					int n = s2.indexOf(s1.substring(i, i + 1));
					String s2start = s2.substring(0, n);
					String s2end = s2.substring(n + 1);
					s2 = s2start + s2end;
				}
			}
		}
		
		return b;
	}
	
	public static boolean isAnagram(String s1, String s2) {		
		boolean b = true;
		
		// Null or Empty Cases
		if (s1==null) {
			b = s2==null;
		} else if (s2==null) {
			b = s1==null;
		} else if (s1.equals("")) {
			b = s2.equals("");
		} else if (s2.equals("")) {
			b = s1.equals("");
		} 
		
		// Strings of different lengths
		else if (s1.length() != s2.length()) {
			b = false;
		}
		
		// Strings
		else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			HashMap<Character, Integer> hMap1 = toHashMap(s1);
			HashMap<Character, Integer> hMap2 = toHashMap(s2);
			for (char c : hMap1.keySet()) {
				if (!hMap2.containsKey(c)) {
					b = false;
					break;
				} else if (hMap1.get(c) != hMap2.get(c)){
					b = false;
					break;
				}
			}
		}
		
		return b;
	}
	
	public static HashMap<Character, Integer> toHashMap(String s){
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		if (s == null) return hmap;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (hmap.containsKey(c)) {
				hmap.replace(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}
		return hmap;
	}


}