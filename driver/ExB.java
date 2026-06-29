package driver;

public class ExB extends ExA {

    public ExB() {
        super();
        System.out.println("im non para conts of class b");

    }

    private ExB(int a) {
        super();
        System.out.println("im int para cont of b class");
    }
}
