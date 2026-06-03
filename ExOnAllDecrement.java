public class ExOnAllDecrement {
    public static void main(String[] args) {
        int i = 144;
        int j = i-- - 12 + i++ - 4;
        int k = i + j++;
        System.out.println(k++ + --j + k);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
