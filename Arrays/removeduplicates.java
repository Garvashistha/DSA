import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeduplicates {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int arr[] = {4,5,6,2,5,2,2};
        for(int i = 0; i<arr.length;i++){
            set.add(arr[i]);
        }
            int[] result = new int[set.size()];
        int index = 0;
        for(int num:set) {
            result[index++] = num;
        }
            System.out.println(Arrays.toString(result));

    }
}
