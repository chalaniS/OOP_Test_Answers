package VersionG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager extends Employee{
	
	private String Department;
	private int ProductNo1, ProductNo2, ProductNo3;
		
	
	public Manager(String empID, String name, String address, String department, int productNo1, int productNo2,
			int productNo3) {
		super(empID, name, address);
		Department = department;
		ProductNo1 = productNo1;
		ProductNo2 = productNo2;
		ProductNo3 = productNo3;
	}
	
	public void Read() {
		
	    super.Read();			
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department : ");
		Department = sc.nextLine();
		
		try {
			System.out.print("Enter ProductNo1 : ");
			ProductNo1 = sc.nextInt();
			
			System.out.print("Enter ProductNo2 : ");
			ProductNo2 = sc.nextInt();		
			
			System.out.print("Enter ProductNo3 : ");
			ProductNo3 = sc.nextInt();
			
		}catch(InputMismatchException e) {
			
			System.out.print("Invalid Input...!");
			
		}
	}
	
	public void Print() {
		
		super.Print();		
		System.out.print("Department : "+ Department + "\nProductNo1 : " + ProductNo1 + "\nProductNo2 : " + ProductNo2 + "\nProductNo3 : " + ProductNo3);					
	
	}
	
	

}


