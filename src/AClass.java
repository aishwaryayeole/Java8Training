
public class AClass implements Interface1, Interface2 {

	
	public void method1() {
		// TODO Auto-generated method stub
		Interface1.super.method1();
		Interface2.super.method1();
	}
	
	public static void main(String[] args) {
		AClass aObj= new AClass();
		aObj.method1();
	}

}
