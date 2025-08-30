import java.util.Arrays;

public class arraysorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4};
        if(arr.length == 0){
            System.out.println("nothing");
        }
        int i = 0;
        for(int j =1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        int[] uniqueArr = Arrays.copyOf(arr, i + 1);
        System.out.println(Arrays.toString(uniqueArr));
    }
}