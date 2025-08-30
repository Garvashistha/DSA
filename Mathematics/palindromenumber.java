public class palindromenumber {
    public static void main(String[] args) {
        palindrome(1221);
    }
    static void palindrome(int n) {
        int duplicate = n;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        if (rev == duplicate) {
            System.out.println(duplicate + " is palindrome");
        } else {
            System.out.println(duplicate + " is not palindrome");
        }
    }
}
