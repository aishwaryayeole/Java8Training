
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
		
		Operation isOdd = (num1)-> {return num1%2==0?"No":"Yes";};
		System.out.println(isOdd.operate(63));
		
		Operation isPrime = (num)-> {
			Boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        return !flag?"Prime":"Composite";
		};
		System.out.println(isPrime.operate(63));
		
		Operation isPalindrome = (n)-> {  
		int r,sum=0,temp;    
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }  
		  return temp==sum?"Palindrome":"Not a Palindrome";
		};
		System.out.println(isPalindrome.operate(63));
	

		
	}

}
