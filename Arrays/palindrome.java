import java.util.Scanner;
public class palindrome {
    public boolean palindromes(int number) {
        int reverse = 0;
        int duplicate = number;
        while (number > 0) {
            reverse = (reverse*10) + (number % 10);
            number = number / 10;
        }
        return reverse == duplicate;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        palindrome obj = new palindrome();
        boolean result = obj.palindromes(number);
        if (result) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}