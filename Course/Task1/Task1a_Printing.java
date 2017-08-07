package Task1;
import java.text.MessageFormat;

public class Task1a_Printing {

	public static void main(String[] args) {

		print("Ivo", 22);

	}

	public static void print(String name, int age) {
		System.out.println(MessageFormat.format("{0} is {1} years old", name, age));
	}

}
