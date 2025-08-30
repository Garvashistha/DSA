import java.util.Arrays;

public class mergesortedarrays {
    public static int[] marge(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int[] merge = new int[n+m];
        int i =0, j = 0, k = 0;
        while(i<n && j<m){
            if(arr1[i]>arr2[j]){
                merge[k++] = arr2[j++];
            }
            else{
                merge[k++] = arr1[i++];
            }
        }
        while(i<n){
            merge[k++] = arr1[i++];
        }
        while(j<m){
            merge[k++] = arr2[j++];
        }
        return merge;
    }

    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,4,6};
        int result[] = marge(arr1,arr2);
            System.out.println(Arrays.toString(result));
    }
}
