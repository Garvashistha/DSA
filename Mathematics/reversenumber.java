public class reversenumber {
    public static void main(String[] args) {
        reverse(7542);
    }
        static void reverse(int n){
            int rev= 0;
            while(n>0){
                int lastdigit = n%10;
                rev = (rev*10) + lastdigit;
                n=n/10;
            }
            System.out.println(rev);
        }
    }

