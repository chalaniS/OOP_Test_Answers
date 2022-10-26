package VersionC;

public class RandNum {
	
	int arr[][] = new int[5][5];
	
	RandNum() {
		 for(int i = 0; i<5; i++) {
			 for(int j = 0; j<5; j++) {
				 arr[i][j] = (int)(Math.random() *10);
			 }
		 }
		 
		 minimum();
		 maximum();
		 avarage(); 
		 
	}
	
	public int minimum() {
		int min = arr[0][0];
		for(int i = 0; i<5; i++) {
			 for(int j = 0; j<5; j++) {
				 
				 if(min > arr[i][j])
					min = arr[i][j];				 
			 }
		 }
		
		return min;
		
	}	
		
	public int maximum() {
		int max = arr[0][0];
		for(int i = 0; i<5; i++) {
			 for(int j = 0; j<5; j++) {
				 
				 if(max < arr[i][j])
					 max = arr[i][j];				 
			 }
		 }
		
		return max;		
	}
	
	public double avarage() {
		int total = 0 ;
		for(int i = 0; i<5; i++) {
			 for(int j = 0; j<5; j++) {
				 
				 total+=arr[i][j];
				 
			 }
		 }
		return total/25.0;
		
	}
	
	public void display() {
		
		System.out.print("Minimum : " + minimum() + "\nMaximum : " + maximum() + "\nAvarage : " + avarage());
		
	}
	
	
	
	
	public static void main(String args[]) {		
		
		RandNum num = new RandNum();
		
		num.display();		
		
	}
	
	
}
