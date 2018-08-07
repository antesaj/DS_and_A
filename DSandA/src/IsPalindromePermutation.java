import java.util.HashMap;


/*
 * Cracking the Coding Interview - Problem 1.4
 * 
 * Write a method that determines whether a given string
 * is a palindrome permutation.
 */
public class IsPalindromePermutation {

	public static void main(String[] args) {
		System.out.println(isPalindromePermutation("reccaarerp"));
	}
	
	public static boolean isPalindromePermutation(String str) {
		String[] strArr = str.replaceAll(" ", "").split("");
		HashMap<String, Integer> map = asciiMap();
		
		// Collect occurrences of each character.
		for (int i = 0; i < strArr.length; i++) {
			map.put(strArr[i], map.get(strArr[i]) + 1);
		}
		
		
		/*
		 * If even number of characters, all characters must occur in
		 * multiples of two.
		 */
		if (strArr.length % 2 == 0) {
			for (int i = 0; i < strArr.length; i++) {
				if (map.get(strArr[i]) % 2 != 0) {
					return false;
				}
			}
			return true;
			
		/*
		 * If odd number of characters, one and only one set of characters
		 * occurs an odd number of times. The rest are even.
		 */
		} else {
			String tracker = "";
			for (int i = 0; i < strArr.length; i++) {
				if (!tracker.contains(strArr[i]) && map.get(strArr[i]) % 2 == 1) {
					tracker += strArr[i];
				}
			}
			if (tracker.length() != 1) {
				return false;
			}
			return true;
		}
		
	}
	
	public static HashMap<String, Integer> asciiMap() {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i <= 255; i++) {
            map.put(Character.toString((char) i), 0);
        }
        
        return map;
    }
	
}
