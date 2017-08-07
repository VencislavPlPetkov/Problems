package Task2_CommonSubset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import Task3_dateDifference.SwiftDate;

public class CommonSubset {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String size = sc.nextLine();
		String first = sc.nextLine();
		String second = sc.nextLine();

		int[] sizes = parseInput(first);
		int[] nums1 = parseInput(first);
		int[] nums2 = parseInput(second);

		// int[] nums1 = { 1, 2, 3, 4, 5 };
		// int[] nums2 = { 1, 3, 5, 7, 9, 11 };

		LinkedList l = new LinkedList<>();

	}

	public static int[] parseInput(String input) {

		String[] inputStringArr = input.split(" ");

		int[] inputIntArr = new int[inputStringArr.length];
		for (int i = 0; i < inputStringArr.length; i++) {
			String numberAsString = inputStringArr[i];
			inputIntArr[i] = Integer.parseInt(numberAsString);
		}

		return inputIntArr;
	}

}
