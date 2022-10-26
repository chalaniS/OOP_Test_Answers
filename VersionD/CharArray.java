package VersionD;

public class CharArray {
	
    char myCharArray[] = {'s'};   
    char reverse[] ; 
    
    
    int j = 0;
    

	CharArray (char[] myCharArray) {
		
		super();
		this.myCharArray = myCharArray;
		
	}
	
	public char[] swapFirstAndLast() {	
		
		reverse = new char[myCharArray.length];
		
		for(int i = myCharArray.length-1 ; i >= 0; i-- ) {
			reverse[j++] = myCharArray[i];			
		}
		
		return reverse;
		
	}
	
	public void DisplayArray() {
		for(int i = 0; i < myCharArray.length; i++ ) {
			System.out.print(reverse[i]);	
		}
		
	}
	
	public static void main(String arg[]) {
		
		char myArray[] = {'s', 'a', 'u','m','y','a'};
		
		CharArray arr = new CharArray(myArray);		
		
		arr.swapFirstAndLast();
		arr.DisplayArray();		
		
	}

}
