public class countdigits {
    public static void main(String[] args) {
        digits(37657362);
    }

    static void digits(int n) {
        int count = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            count = count + 1;
            n = n / 10;
        }
        System.out.println(count);
    }
}