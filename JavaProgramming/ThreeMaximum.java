package JavaProgramming;

import java.util.Scanner;

public class ThreeMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();
        int maximum = a;
        if (b > maximum) {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        System.out.println("The maximum number is: " + maximum);
        scanner.close();
    }
}