package zadacha1;

import java.util.Random;

public class zadacha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 int d1 = 0;
int d2 = 0;
int reslt = sum (d1, d2);
		
	}

	public static int sum (int die1, int die2) {
		
		Random rand = new Random();
		die1 = 1 + rand.nextInt(6);
		die2 = 1 + rand.nextInt(6);

		int sum = die1 + die2;
		System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

		if (sum == 2 || sum == 3 || sum == 12) {
		System.out.println("You lose");	
		}else if(sum == 7 || sum == 11) {
			System.out.println("You win");	
		}else if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
			System.out.println("point is " + sum);	
			int sumCopy = sum;
		sum = 0;
		 do {
				die1 = 1 + rand.nextInt(6);
			
				die2 = 1 + rand.nextInt(6);
				sum = die1 + die2;
				if (sum == 7) {
					System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
					System.out.println("You lose");
				}else if(sum == sumCopy) {
					System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
					System.out.println("You win");
				}
				break;
			} while (sum == 7 || sum == sumCopy);
		
		}
		return 0;
	}
	}
