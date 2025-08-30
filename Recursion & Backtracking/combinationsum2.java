import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsum2 {
    public static void main(String[] args) {
        int arr[] = {10, 1 , 2 , 7 , 6 , 1 , 5};
        int target = 8;
        List<List<Integer>> result  = new ArrayList<>();
        Arrays.sort(arr);
        findcombination(0,arr,target,new ArrayList<>() ,result );
        System.out.println(result);
    }
    public static void findcombination(int index , int arr[] , int target , List<Integer>current , List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index ; i<arr.length;i++){
            if(i>index && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;
            current.add(arr[i]);
            findcombination(i+1,arr,target - arr[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}
