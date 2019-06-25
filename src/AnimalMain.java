
public class AnimalMain {
	
	public static void main(String[] args) {
		/*Default method in interface*/
		Animal dog = new Dog();
		dog.eat();
		
		Animal sparrow = new Sparrow();
		sparrow.walk();
	}

}
