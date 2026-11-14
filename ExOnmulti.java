public class ExOnmulti {

    public static void main(String[] args) throws InterruptedException {

        // 1. try-catch inside run()
        System.out.println("1. try/catch inside the thread");

        Thread t1 = new Thread(() -> {
            try {
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught inside thread: " + e.getMessage());
            }
        }, "Thread-A");

        t1.start();
        t1.join();

        System.out.println("Main thread completed");

        // 2. try-catch inside main()
        System.out.println("\n2. try/catch inside main thread");

        Thread t2 = new Thread(() -> {
            System.out.println("Child thread is running");
        }, "Thread-B");

        t2.start();

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught inside main: " + e.getMessage());
        }

        t2.join();

        System.out.println("Main thread completed");
    }

}
