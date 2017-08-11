package lambda.Greeting;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		greeter.greet(helloWorldGreeting);
		
		helloWorldGreeting.perform();
		
		
		
		
		Greeting innerClassGreeting = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hi");
			}
		};
		innerClassGreeting.perform();
		greeter.greet(innerClassGreeting);
		
		
		
		
		
		Greeting myLambdaFunction = () -> System.out.println("Hi");
		myLambdaFunction.perform();
		greeter.greet(myLambdaFunction);

	}

}
