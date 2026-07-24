package Exception;

import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age > 18 && age <= 100) {
            System.out.println("you are elligible to cast the vote");
        } else {
            try {
                throw new AgeInvalidException();
            } catch (AgeInvalidException a) {
                System.out.println(a.getMessage());
            }
        }
    }
}
