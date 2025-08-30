import java.util.Scanner;

public class reverse {
    static int reversed = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        reversed = reversed * 10 + rem;
        reverse(n / 10);
    }
}
