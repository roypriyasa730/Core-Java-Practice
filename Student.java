public class Student {
    String name;
    int id;
    int age;

    public static void main(String[] args) {
        final Student s1 = new Student();
        s1.name = "Priyasa";
        s1.id = 143;
        s1.age = 24;

        Student s2 = new Student();
        s2.name = "Priya";
        s2.id = 153;
        s2.age = 25;

        System.err.println(s1.name);
        s1.name = "Priyasa Roy";
        System.err.println(s1.name);
        System.err.println(s2.name);
    }
}
