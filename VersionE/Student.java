package VersionE;
public class Student {

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