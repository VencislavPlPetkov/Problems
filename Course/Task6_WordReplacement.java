package Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_WordReplacement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String n = sc.nextLine();
		String firstLine = sc.nextLine();
		String secondLine = sc.nextLine();
		String thirdLine = sc.nextLine();

		// String s = "Peter loves dogs but he hates cats.";

		// String firstLine = "peter gosho";
		// String secondLine = "loves hates";
		// String thirdLine = "hates loves";

		String input = s.toLowerCase();
		String[] original = input.split(" ");

		Map<String, String> swapValues = new HashMap<String, String>();

		fillHashMap(swapValues, firstLine);
		fillHashMap(swapValues, secondLine);
		fillHashMap(swapValues, thirdLine);

		String result = replace(swapValues, original);

		System.out.println(result);

	}

	public static String replace(Map<String, String> swapValues, String[] original) {

		String res = "";

		for (int i = 0; i < original.length; i++) {

			if (swapValues.containsKey(original[i])) {
				original[i] = swapValues.get(original[i]);
			}
			res += original[i] + " ";
		}

		return res;
	}

	public static void fillHashMap(Map<String, String> swapValues, String input) {

		String[] inputStringArr = input.split(" ");

		swapValues.put(inputStringArr[0], inputStringArr[1]);

	}

}
