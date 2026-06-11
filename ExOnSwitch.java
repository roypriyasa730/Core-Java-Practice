import java.util.Scanner;

public class ExOnSwitch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String choice = sc.next();
            switch (choice) {
                case "Monday": {
                    System.out.println("Today is Monday");
                    break;
                }
                case "Tuesday": {
                    System.out.println("Today is Tuesday");
                    break;
                }

                case "Wednesday": {
                    System.out.println("Today is Wednesday");
                    break;
                }
                case "Thursday": {
                    System.out.println("Today is Thursday");
                    break;
                }
                case "Friday": {
                    System.out.println("Today is Friday");
                    break;
                }
                case "Saturday": {
                    System.out.println("Today is Saturday");
                    break;
                }
                case "Sunday": {
                    System.out.println("Today is Sunday");
                    break;
                }
                default: {
                    System.out.println("Invalid day");
                }
            }
        }
    }

}
