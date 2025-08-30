public class primenumber {
    public static void main(String[] args) {
        prime(11);
    }
    static void prime(int n){
        int duplicate = n;
        boolean isprime = true;
        if(n<=1){
            isprime = false;
        }
        else{
            for(int i = 0;i*i<=n;i++){
                if(n%i==0){
                    isprime = false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(duplicate + " is prime");
        }
        else{
            System.out.println(duplicate + " is not prime");
        }
    }
}
