@FunctionalInterface
public interface Greeting {
	
	/*
	 * public void greetBasic();
	 *  public String greet();
	 */
	// public void greetNoReturn(String name);
	public String greet(String name);
	public default void abc() {System.out.println("you can write more than one default methods in functional interface");};
 }
