package zadacha3;

public class zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberCount = 0;
		for (int i = 1; i < numberCount; i++) {
			if (isEmirp(i)) {
				numberCount++;
				System.out.print(i + " ");
				if (numberCount % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	
	public static boolean isEmirp (int number) {
		boolean isPrime = false, isReversedPrime = false;
		int maxDivider = (int)Math.sqrt(number);
		  for (int i = 2; i <= maxDivider; i++ ){
		    if( number % i == 0){	
		    	isPrime = true;
		      }	
		    }
		 
		  int  reversed = 0;
		  while(number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        } 
	        if (number == reversed) {
	        	isReversedPrime = true;
	        }
	        
	        if (isPrime && isReversedPrime) {
	        	return true;
	        }else {
	        	return false;
	        }


}
}
