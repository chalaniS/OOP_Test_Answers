package VersionE;

class MyException extends Exception {

    MyException(String id) {    	

        if (id.substring(0, 1) != "IT" & id.length() != 8)
            System.out.println("Invalid IT number..");

    }
}

public class demo {

    public static void main(String args[]) {

        Student s1 = new Student("Ij3456", "Chalani");
        s1.display();

    }

}