public class maximumsubarray {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int sum = 0;
        int maximum = -1000;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
    }
}
