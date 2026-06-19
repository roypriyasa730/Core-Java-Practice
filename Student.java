public class Student {
    String name;
    int id;
    int age;

    public void assignvalues(String n, int i, int a) {
        name = n;
        id = i;
        age = a;
    }

    public void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.assignvalues("lohitha", 5, 004);
        System.out.println("Student 1 details are");
        s1.display();

        Student s2 = new Student();
        s2.assignvalues("priya", 18, 007);
        System.out.println("Student 2 details are");
        s2.display();
    }
}