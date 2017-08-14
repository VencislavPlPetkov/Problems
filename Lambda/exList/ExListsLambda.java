package exList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExListsLambda {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Zar", 23), new Person("Ahf", 33), new Person("Lar", 13),
				new Person("Mar", 93)

		);

		// Sort list by last name

		Collections.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));

		// Create a method that prints all elements in the list

		printAll(people);

		// Create a method that prints all people that have last name
		// beginning with L

		printConditionally(people, p1 -> p1.name.startsWith("L"));

	}

	private static void printAll(List<Person> people) {

		for (Person p : people) {
			System.out.println(p.name + " is " + p.age);
		}

	}

	private static void printConditionally(List<Person> people, Conditions condition) {

		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p.name + " is " + p.age);
			}
		}

	}

}

interface Conditions {

	boolean test(Person p);

}
