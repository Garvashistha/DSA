public class saydigits {
    static String arr[] = {"zero" , "one" , "two" , "three" , "four"
            , "five" , "six" , "seven" , "eight" , "nine"};
    public static void main(String[] args) {
        digits(232);
    }
    static void digits(int n){
        if(n == 0){
            return;
        }
        int digit = n%10;
        digits(n/10);
        System.out.print(arr[digit] + " ");
    }
}
