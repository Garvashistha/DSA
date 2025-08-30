import java.util.Scanner;

public class palindrome {
    static int reversed = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }

    static boolean isPalindrome(int n) {
        reversed = 0; // reset before reversing
        reverse(n);
        return n == reversed;
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
