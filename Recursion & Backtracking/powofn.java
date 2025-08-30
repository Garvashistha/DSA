public class powofn {
    public static void main(String[] args) {
        System.out.println(pow(4));
    }
    static int pow(int n){
        if(n==0){
            return 1;
        }
        return 2*pow(n-1);
    }
}
