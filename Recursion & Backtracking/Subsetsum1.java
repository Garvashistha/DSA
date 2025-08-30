import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsetsum1 {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        List<Integer> result = new ArrayList<>();
        subsets(0, arr , 0 , result);
        Collections.sort(result);
        System.out.println(result);
    }
    public static void subsets(int index , int arr[] , int currentsum , List<Integer> result){
        if(index == arr.length){
            result.add(currentsum);
            return;
        }
        subsets(index+1, arr , currentsum + arr[index] , result);
        subsets(index+1, arr , currentsum  , result);
    }
}
