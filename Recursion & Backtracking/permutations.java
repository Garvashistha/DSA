import java.util.*;
public class permutations {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        generatepermutations(arr , used , new ArrayList<>() , result);
        for(List<Integer> perm : result){
            System.out.println(perm);
        }
    }
    public static void generatepermutations(int arr[] , boolean used[], List<Integer> current , List<List<Integer>> result){
        if(current.size() == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0 ; i<arr.length; i++){
            if(!used[i]){
                used[i] = true;
                current.add(arr[i]);
                generatepermutations(arr,used,current,result);
                current.remove(current.size()-1);
                used[i] = false;
            }
        }
    }
}
