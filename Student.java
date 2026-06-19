public class Student {
    String name;
    int id;
    int age;

    // this method work to assign the values to non staic variable
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
        s1.assignvalues("priyasa", 121, 21);
        s1.display();

        System.out.println();

        Student s2 = new Student();
        s2.assignvalues("priya", 122, 22);
        s2.display();
    }
}