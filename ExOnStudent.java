public class ExOnStudent {
    String name;
    int age;

    ExOnStudent() {
        System.out.println("Default constructor");
    }

    ExOnStudent(String name) {
        System.err.println("Parameterized constructor with name: " + name);

    }

    ExOnStudent(String name, int age) {
        System.err.println("Parameterized constructor with name: " + name + " and age: " + age);
    }
}

public static void main(String[] args) {
    ExOnStudent student1 = new ExOnStudent();
    ExOnStudent student2 = new ExOnStudent("John");
    ExOnStudent student3 = new ExOnStudent("Jane", 20);
}