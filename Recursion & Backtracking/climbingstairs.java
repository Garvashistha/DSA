public class climbingstairs {
    public static void main(String[] args) {
        System.out.println(ways(8));
    }
    static int ways(int n){
        if(n<0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return ways(n-1) + ways(n-2);
    }
}
