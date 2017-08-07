package Task3_dateDifference;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SwiftDate {

	int year;
	int month;
	int day;
	Date date;

	public SwiftDate(int year, int month, int day, Date date) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.date = date;
	}

	public SwiftDate() {
		// TODO Auto-generated constructor stub
	}

	boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	int getCentury() {
		if (year % 100 == 0) {
			year = year / 100;
		} else {
			year = (year / 100) + 1;
		}
		return year;
	}

	int getDaysDifference(SwiftDate other) {

		int diffInDays = (int) ((date.getTime() - other.date.getTime()) / (1000 * 60 * 60 * 24));
		
		
		return Math.abs(diffInDays);
	}

	String getInfo() {

		int thisCentury = getCentury();

		SimpleDateFormat dffYear = new SimpleDateFormat("yyyy");
		SimpleDateFormat dffMonth = new SimpleDateFormat("MM");
		SimpleDateFormat dffDay = new SimpleDateFormat("dd");
		String yearN = dffYear.format(date);
		String monthN = dffMonth.format(date);
		String dayN = dffDay.format(date);

		String result = yearN + " " + monthN + " " + dayN + " - " + thisCentury + " century.";

		if (isLeapYear(Integer.parseInt(yearN))) {
			result += "It is LEAP year.";
		}

		return result;
	}

}
