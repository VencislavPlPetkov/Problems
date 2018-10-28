import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

	public static boolean areAnagrams(String str1, String str2) {

		char[] word1 = str1.toLowerCase().replaceAll("\\W", "").toCharArray();
		char[] word2 = str2.toLowerCase().replaceAll("\\W", "").toCharArray();

		// First Way - O(n log n) because of sorting

		// Arrays.sort(word1);
		// Arrays.sort(word2);
		//
		// return Arrays.equals(word1, word2);

		Map<Character, Integer> letters = new HashMap<Character, Integer>();

		int count;

		for (char c : word1) {
			// Check if there already is such char, if there isn't we put it in
			// the map and increment count
			count = letters.containsKey(c) ? letters.get(c) : 0;
			letters.put(c, count + 1);
		}

		for (char c : word2) {
			// Check if there already is such char, if there is we decrement
			// count
			count = letters.containsKey(c) ? letters.get(c) : 0;
			letters.put(c, count - 1);
		}

		// Check if all values are zero to satisfy anagram property

		for (char c : letters.keySet()) {
			if (letters.get(c) != 0) {
				// Not anagrams
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(areAnagrams("Silent", "Listen"));
		System.out.println(areAnagrams("Dormitory", "Ditry Room"));
		System.out.println(areAnagrams("this should", "be false"));
		System.out.println(areAnagrams("", ""));

	}

}
