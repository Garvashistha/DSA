import java.util.Arrays;

public class segregateevenandodd {
    public void segregate(int[] arr, int left, int right){
        while(left<right){
            while(arr[left]%2 == 0 && left<right){
                left ++ ;
            }
            while(arr[right]%2!= 0 && left<right){
                right --;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++ ;
                right --;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9};
        segregateevenandodd sos = new segregateevenandodd();
        sos.segregate(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
    }
}
