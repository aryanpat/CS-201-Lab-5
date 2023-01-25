package boom;

import java.util.*;

public class Prime {
	
	public static void main(String[] args) {
        
		//Find all prime numbers between 1-150
		//Take prime numbers and find the average between them
		//Take prime numbers and find the variance between them
		//Print results
		
        int ave = 0; //setting average to 0
        int sum = 0; //setting sum to 0
        
        ArrayList<Integer> primeList = new ArrayList<>(); //Array list for prime #'s
        
        for (int a=2; a <= 150; a++) { //for loop that will add any valid numbers from 1-150 to the array list
        	
            boolean prime = false;
            
            for (int b=2; b <= (a-1); b++) {
                
            	if (a % b == 0) {
            		
                    prime = true;
                    break;
                    
                }
            }
            if (prime == false) {
            	
                primeList.add(a);
                
            }
        }
        
        System.out.println(primeList); //print the prime list

        for (int c = 0; c <= (primeList.size())-1; c++) { //for loop that will help find average with the sum
        	
            sum += primeList.get(c);
            
        }
        
        ave = sum / (primeList.size()); //set average
        System.out.println((float)ave); //print the average with float points
        
    }
	
}
