package zadacha2;
import java.lang.Math;
public class zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberCount = 0;
		for (int i = 1; i < numberCount; i++) {
			if (isPalindrome(i) && isPrime(i)) {
				numberCount++;
				System.out.print(i + " ");
				if (numberCount % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		
		}

	
	
	
	public static boolean isPrime (int num) {
		boolean isPrime = true;
		int maxDivider = (int)Math.sqrt(num);
		  for (int i = 2; i <= maxDivider; i++ ){
		    if( num % i == 0){
		      return false;		   
		      }		      
}
		
return true;		  

	}
	
	
	public static boolean isPalindrome (int num) {
		 int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger != reversedInteger) {
        	return true;        	
        }else {
        	return false;
        }
       
	}
}

	