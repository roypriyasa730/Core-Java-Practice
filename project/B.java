package project;

class B {
    String s = "students";

    B() {
        this("bye");
        System.out.println("hello");
    }

    B(String s) {
        System.out.println(this.s + s);
    }

}
