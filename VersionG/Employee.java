package VersionG;

import java.util.Scanner;

 abstract class Employee {
	
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
