package boom;

import java.util.Random;
import java.util.Scanner;  


public class Bomb {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int a = r.nextInt(1,101);
		
		int min = 1;
		int max = 100;
		
		int p1 = 0;
		int p2 = 0;
		
		int minR = min;
		int maxR = max;
		
		System.out.println(a);
		Scanner input = new Scanner(System.in);
		
		while(p1 != a && p2 != a){
		
			System.out.println("Player 1 Number!");
			p1 = input.nextInt();

			if (p1 > maxR || p1 < minR) {
				System.out.println("Invalid input. Please enter a number in the range!");
				System.out.println("Player 1 Number: ");
				p1 = input.nextInt();
			}
		
			if (p1 == a) {
				System.out.println("BOOM! Player 2 wins!");
			}
			else if(p1 > a){
				System.out.println("Guess too high, now the range is: " + minR + " - " + (p1 - 1));
				maxR = p1;
			}
			else {
				System.out.println("Guess too low, now the range is: " + (p1 + 1) + " - " + maxR);
				minR = p1;
			}
			
			if(p1 == a || p2 == a) {
				
				input.close();
				System.out.println("Game over!");
				
			} 
			
			else{
		
				System.out.println("Player 2 Number: ");
				p2 = input.nextInt();
		
				if (p2 > maxR || p2 < minR) {
					System.out.println("Invalid input. Please enter a number in the range!");
					System.out.println("Player 2 Number: ");
					p2 = input.nextInt();
				}
		
		
				if (p2 == a) {
					System.out.println("BOOM! Player 1 wins!");
				}
				else if(p2 > a){
					System.out.println("Guess too high, now the range is: " + minR + " - " + (p2 - 1));
					maxR = p2;
				}
				else {
					System.out.println("Guess too low, now the range is: " + (p2 + 1) + " - " + maxR);
					minR = p2;
				}
			}
			
			if(p2 == a) {
				input.close();
				System.out.println("Game over!");
			}
			
		}
	}
}

