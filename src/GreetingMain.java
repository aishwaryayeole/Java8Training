
public class GreetingMain {
	public static void main(String[] args) {
		
		
		/*
		 * Greeting greeting = () -> "greeting 2";
		 *  System.out.println(greeting.greet());
		 */
		
		/*
		 * Greeting greeting2 = (String a) -> System.out.println("Here: "+a);
		 * greeting2.greetNoReturn("Sherlock");
		 */
		
		 Greeting greeting3 = (String a) -> "Brooklyn nine nine "+ a;
		 System.out.println(greeting3.greet("is fun"));
		 
	
	}
}
