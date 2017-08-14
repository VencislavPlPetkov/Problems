package exList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExLists {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Zar", 23), new Person("Ahf", 33), new Person("Lar", 13),
				new Person("Mar", 93)

		);

		// Sort list by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
			}

		});

		// Create a method that prints all elements in the list

		printAll(people);

		// Create a method that prints all people that have last name
		// beginning with L

		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.name.startsWith("L");
			}
		});

	}

	private static void printAll(List<Person> people) {

		for (Person p : people) {
			System.out.println(p.name + " is " + p.age);
		}

	}

	private static void printConditionally(List<Person> people, Condition condition) {

		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p.name + " is " + p.age);
			}
		}

	}

}

interface Condition {

	boolean test(Person p);

}
