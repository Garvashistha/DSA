public class armstrongnumber {
    public static void main(String[] args) {
        armstrong(153);
    }

    static void armstrong(int n) {
        int duplicate = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            rem = rem * rem * rem;
            sum = sum + rem;
            n = n / 10;
        }
        if (duplicate == sum) {
            System.out.println(sum + " is an armstrong number");
        } else {

        }
    }
}
