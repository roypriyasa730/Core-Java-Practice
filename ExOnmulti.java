public class ExOnmulti {
    public static void main(String[] args) throws Exception {

        // 1. try-catch inside run()
        System.out.println("--- 1. try/catch inside the thread ---");

        Thread t1 = new Thread(() -> {
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(
                        "Caught inside thread: " + e.getMessage());
            }
        }, "Thread-A");

        t1.start();
        t1.join();

        System.out.println("Main thread completed");
    }
}
