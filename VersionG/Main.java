package VersionG;

import java.util.InputMismatchException;
import java.util.Scanner;

 class Employee {
	
	private String EmpID, name, address;

	public Employee(String empID, String name, String address) {
		
		super();
		EmpID = empID;
		this.name = name;
		this.address = address;
		
	}
	
	public void Read() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		EmpID = sc.nextLine();
		
		System.out.print("Enter name : ");
		name = sc.nextLine();
		
		System.out.print("Enter address : ");
		address = sc.nextLine();			
		
	}
	
	public void Print() {
		
		System.out.print("\n\nID : "+ EmpID + "\nName : " + name + "\nAddress : " + address);					
	}

}


class Manager extends Employee{
	
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




public class Main {
	
	public static void main(String args[]) {
		
		Manager m = new Manager(null, null, null, null, 0, 0, 0);
		
		m.Read();
		m.Print();
		
		
	}

}
