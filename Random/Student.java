package Random;

public class Student extends College {
    String sName;
    int sId;
    int sAge;

    Student(String cName, String cCode, String cAdderss, String branch, String sName, int sId, int sAge) {
        super(cName, cCode, cAdderss, branch);
        this.sName = sName;
        this.sId = sId;
        this.sAge = sAge;
    }

    public void displayStudentDetails() {
        System.out.println("College Name: " + cName);
        System.out.println("College Code: " + cCode);
        System.out.println("College Address: " + cAdderss);
        System.out.println("Branch: " + branch);
        System.out.println("Student Name: " + sName);
        System.out.println("Student ID: " + sId);
        System.out.println("Student Age: " + sAge);
    }
}
