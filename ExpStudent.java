public class ExpStudent {
    String name;
    int age;
    int id;
    String emailid;
    double perc;

    ExpStudent(String name, int age) { // Constructor with name and age parameters
        this.name = name;
        this.age = age;

    }

    ExpStudent(String name, int age, int id, String emailid, double perc) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.emailid = emailid;
        this.perc = perc;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.id);
        System.out.println("Email ID: " + this.emailid);
        System.out.println("Percentage: " + this.perc);
    }

    public static void main(String[] args) {
        ExpStudent student1 = new ExpStudent("John", 20);
        student1.displayStudentDetails();

        ExpStudent student2 = new ExpStudent("Alice", 22, 101, "alice@example.com", 85.5);
        student2.displayStudentDetails();

        ExpStudent student3 = new ExpStudent("Bob", 21, 102, "bob@example.com", 90.0);
        student3.displayStudentDetails();
    }
}
