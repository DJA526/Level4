package palindromes;

public class Palindromes {
	
	public static boolean isPalindrome(String s1) {
		if (s1==null) {
			return false;
		} 
		if (s1.isEmpty()){
			return true;
		}
		s1 = s1.toLowerCase().replaceAll("[//.,' ]", "");
		boolean charsMatch = true;
		for (int i = 0; charsMatch &&  i < s1.length(); i++) {
			if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
				charsMatch = false;
			}
		}
		return charsMatch;
	}

}
