
public interface Animal {
	
	public void eat();
	public void speak();
	public default void walk() {System.out.println("4 legs");};

}
