import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,1,0};
        Sorted(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int Sorted(int[] arr, int n){
        if(n==0 || n ==1){
            return n;
        }
        for(int i = 0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp =arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return Sorted(arr, n-1);
    }
}
