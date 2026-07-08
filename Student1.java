public class Student1 {
    String name;
    int id;
    int age;

    public String toString() {
        return "name is :" + this.name + ", age is" + this.age + ", id is:" + this.age;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "priya";
        s1.id = 123;
        s1.age = 45;
        System.out.println(s1);
        System.out.println(s1.toString());

        Student1 s2 = new Student1();
        s2.name = "gadhu";
        s2.id = 121;
        s2.age = 46;
        System.out.println(s2.toString());
    }
}
