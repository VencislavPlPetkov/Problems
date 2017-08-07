package Task2_Classes;

import java.text.MessageFormat;
import java.util.Objects;

public class Person {

	private String name;
	private int age;

	Person() {
		this.name = "No name";
		this.age = -1;
	}

	Person(String name) {
		this.name = name;
		this.age = -1;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 150) {
			this.age = age;
		} else {
			System.out.println("Age must be between 0 and 150");
		}
	}

	public String introduce() {
		String introduction = "I am John Doe";
		if (!Objects.equals(this.name, "No name") && !Objects.equals(this.age, -1)) {
			introduction = MessageFormat.format("Hello, I am {0}. I am {1} years old.", this.name, this.age);
		} else if (!Objects.equals(this.name, "No name") && Objects.equals(this.age, -1)) {
			introduction = MessageFormat.format("Hello, I am {0}.", this.name, this.age);
		}
		return introduction;

	}

}
