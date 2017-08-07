package Task3_dateDifference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class testSwiftDate {

	public static void main(String[] args) {
		// "2016 9 26"
		// "1878 3 3"

		// "2016 09 26"
		// "2017 01 01"

		// SwiftDate firstDate = parseInput("2016 09 26");
		// SwiftDate secondDate = parseInput("2017 01 01");

		SwiftDate firstDate = parseInput("2016 9 26");
		SwiftDate secondDate = parseInput("1878 3 3");

		// Scanner sc = new Scanner(System.in);
		//
		// String first = sc.nextLine();
		// String second = sc.nextLine();

		// SwiftDate firstDate = parseInput(first);
		// SwiftDate secondDate = parseInput(second);

		int diff = firstDate.getDaysDifference(secondDate);

		System.out.println(diff);

		System.out.println(firstDate.getInfo());
		System.out.println(secondDate.getInfo());

	}

	public static SwiftDate parseInput(String input) {

		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy MM dd").parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2016 09 26
		String[] inputStringArr = input.split(" ");

		int[] inputIntArr = new int[inputStringArr.length];
		for (int i = 0; i < inputStringArr.length; i++) {
			String numberAsString = inputStringArr[i];
			inputIntArr[i] = Integer.parseInt(numberAsString);
		}

		int year = inputIntArr[0];
		int month = inputIntArr[1];
		int day = inputIntArr[2];

		return new SwiftDate(year, month, day, date);
	}

}
