public class ntoone {
    public static void main(String[] args) {
        print(5,1);
    }
    public static void print(int i , int n){
        if(i<n){
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }
}
