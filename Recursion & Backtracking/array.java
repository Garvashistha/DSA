import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        Arrays.sort(arr);
        int median = arr[arr.length/2];
        int operations = gettotal(arr , median , 0);
        System.out.println(operations);
    }
    public static int gettotal(int arr[] , int median , int index){
        if(index == arr.length){
            return 0;
        }
        return Math.abs(median - arr[index]) + gettotal(arr,median,index+1);
    }
}
