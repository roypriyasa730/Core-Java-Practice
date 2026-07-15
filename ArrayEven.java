import java.util.Scanner;

public class ArrayEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] id = new int[8];
        System.out.println("Enter the 8 id's of student");
        for (int i = 0; i < id.length; i++) {
            id[i] = sc.nextInt();

        }
        System.out.println("Even ids are:");
        for (int i = 0; i < id.length; i++) {
            if (id[i] % 2 == 0) {
                System.out.println(id[i]);
            }
        }

    }
}
