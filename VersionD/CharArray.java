package VersionD;

public class CharArray {
	
    char myCharArray[];   
    char lastChar;
    
    int len = 0;    

	CharArray (char[] myCharArray) {
		
		super();
		this.myCharArray = myCharArray;
		
	}
	
	public char[] swapFirstAndLast() {	
		
		len = myCharArray.length;
		
		lastChar = myCharArray[len-1];
		
		myCharArray[len-1] = myCharArray[0];	
		
		myCharArray[0] = lastChar;		
		
		return myCharArray;
		
	}
	
	public void DisplayArray() {
		for(int i = 0; i < myCharArray.length; i++ ) {
			System.out.print(myCharArray[i]);	
		}
		
	}
	
	public static void main(String arg[]) {
		
		char myArray[] = {'s', 'a', 'u','m','y','a'};
		
		CharArray arr = new CharArray(myArray);		
		
		arr.swapFirstAndLast();
		arr.DisplayArray();		
		
	}

}
