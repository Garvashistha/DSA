public class message {
    public static void main(String[] args) {
        messages(1, 5);
    }
    static void messages(int i , int n) {
        if (i>n) {
            return;
        }
        System.out.println("hello");
        messages(i+1,n);
    }
}
