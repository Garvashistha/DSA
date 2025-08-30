import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        if (IsPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + "is not palindrome");
        }
    }

    static boolean IsPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return IsPalindrome(str, start + 1, end - 1);
    }
}
