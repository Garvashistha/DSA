import java.util.Arrays;
import java.util.Scanner;

public class leftrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("k : ");
        int k = sc.nextInt();
        int[] arr = {4, 2, 1, 5, 8,21};
        k = k % arr.length;
        int temp[] = new int[k];
        for(int i = 0;i<k;i++){
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length ; i++) {
            arr[i - k] = arr[i];
        }
       int j = 0;
        for(int i = arr.length-k;i<arr.length;i++){
            arr[i] = temp[j];
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}



