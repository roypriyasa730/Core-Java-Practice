// This program checks if a number is an Armstrong number or not
class Amstrong {
    public static void main(String[] args) {
        // initialize the number to be checked
        int num = 153;
        int count = 0, temp = num;
        int sum = 0;
        // Count the number of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        // Calculate the sum of the digits raised to the power of count
        while (temp != 0) {
            int fact = 1;
            for (int i = 1; i <= count; i++) {
                fact = fact * (temp % 10);
            }
            sum = sum + fact;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("amstrong");
        } else {
            System.out.println("not amstrong");
        }
    }
}
