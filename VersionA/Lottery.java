package VersionA;

import java.util.ArrayList;
import java.util.Random;

public class Lottery {
	
	public static void main(String arg[]) {
		
		int userNumbers[] = randomNumbers();
		
		int lotteryNumbers[] = randomNumbers();
		
		Integer[] digits = compareLottery(userNumbers, lotteryNumbers);		
		
		System.out.print("Users Numbers : ");	
		
		for(int i=0; i < 5; i++) 		
			System.out.print(" " + userNumbers[i]);		
		
		System.out.print("\nLottery Numbers : ");	
		
		for(int i=0; i < 5; i++) 		
			System.out.print(" " + lotteryNumbers[i]);
		
		System.out.println("\nNumber of matching digits : " +  digits.length);
		
		System.out.print("Matching digits : ");
		
		for(int i=0; i < digits.length; i++) 			
			System.out.print(" " +  digits[i]);		
		
	}
	
    public static  int[] randomNumbers() {
		
		int lotteryNumbers[] = new int[5];
		
		for(int i=0; i < 5; i++) {
						
			Random rn = new Random();
			
			lotteryNumbers[i] = rn.nextInt(10);			
			
		//	System.out.println(lotteryNumbers[i]);
		}
		return lotteryNumbers;
	}
    
    public static  Integer[] compareLottery(int userNumbers[], int lotteryNumbers[]) {
		
		Integer  count = 0;
		
		ArrayList<Integer>  mDigits = new ArrayList<Integer>();
		
		for(int i=0; i < 5; i++) {						
			
			for(int j = 0; j < 5; j++) {
				
				if(lotteryNumbers[i] == userNumbers[j] ) {
					
					mDigits.add(userNumbers[j]);					
					count++;					
				}  
			}			
			
		}
		
		Integer[] digits = new Integer[mDigits.size()];
		
		digits = mDigits.toArray(digits);
		
		return digits;
	}
	

}
