public class ExpStudent {
    String name;
    int age;
    int id;
    String emailId;
    double perc;

    ExpStudent(String name, int age) { // Constructor with name and age parameters
        this.name = name;
        this.age = age;

    }

    ExpStudent(String name, int age, int id, String emailId) {

        this(name, age);
        this.id = id;
        this.emailId = emailId;
    }

    ExpStudent(String name, int age, int id, String emailId, double perc) {
        // Constructor with all parameters
        this(name, age, id, emailId);
        this.perc = perc;
    }

    //
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Email ID: " + emailId);
        System.out.println("Percentage: " + perc);
    }

    public static void main(String[] args) {
        //
        ExpStudent student1 = new ExpStudent("gadhu", 20, 121, "gadhu121@", 5.6);
        student1.displayStudentDetails();

    }
}
