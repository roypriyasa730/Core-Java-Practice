public class ExOnStudent {
    String name;
    int age;

    ExOnStudent() {
        System.out.println("Default constructor");
    }

    ExOnStudent(String name) {
        System.out.println("Parameterized constructor with name: " + name);

    }

    ExOnStudent(String name, int age) {
        System.out.println("Parameterized constructor with name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        ExOnStudent s1 = new ExOnStudent();
        ExOnStudent s2 = new ExOnStudent("John");
        ExOnStudent s3 = new ExOnStudent("Jane", 20);
    }
}