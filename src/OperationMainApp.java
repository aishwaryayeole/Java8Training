
public class OperationMainApp {
	public static void main(String[] args) {
	/*Lambda Expression*/
		
//		Operation multiply= (num1, num2)-> {
//			
//			return num1*num2;};
//			
//		System.out.println("Here is your ans : "+multiply.operate(5,8));
//				
//		Operation power= (num1, num2)-> {
//			return  (int) Math.pow(num1, num2);};
//			
//		System.out.println("Here is your ans : "+power.operate(5,3));
		
		Operation isOdd = (num1)-> {return num1%2==0?0:1;};
		System.out.println();
	

		
	}

}
