package VersionE;

class Student {

    private String StudentID;
    private String StudentName;

    Student(String id, String name) {
        StudentID = id;
        StudentName = name;
    }

    void display() {
        try {   
        	System.out.println("ID : " + StudentID + "\nName : " + StudentName);

            throw new MyException(StudentID);
         
        } catch (MyException e) {       	   
               
            

        }
        
    }

}

class MyException extends Exception {

    MyException(String id) {    	

        if (id.substring(0, 1) != "IT" & id.length() != 8)
            System.out.println("Invalid IT number..");

    }
}

public class demo {

    public static void main(String args[]) {

        Student s1 = new Student("IT2137701", "Sliit");
        s1.display();

    }

}