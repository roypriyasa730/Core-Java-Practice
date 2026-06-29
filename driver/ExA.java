package driver;

class ExA {
    public ExA() {
        System.out.println("im non para cons of a class");

    }

    private ExA(String s) {
        this();
        System.out.println("helo");
    }
}
