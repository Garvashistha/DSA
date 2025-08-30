import java.util.ArrayList;
import java.util.List;

public class Combinationsum {
    public static void main(String[] args) {
        int candidates[] = {2,3,5,6,7};
        int target = 15;
        List<List<Integer>> result = new ArrayList<>();
        findcombinations(0,candidates,target , new ArrayList<>() ,result);
        System.out.println(result);
    }
    public static void findcombinations(int index , int candidates[] , int target ,List<Integer> current ,List<List<Integer>>result ){
        if(target == 0){
            result.add(new ArrayList<>(current));
        }
        if(index == candidates.length || target<0){
            return;
        }
        current.add(candidates[index]);
        findcombinations(index , candidates , target - candidates[index] , current , result);
        current.remove(current.size() - 1);
        findcombinations(index+1 , candidates , target , current , result);
    }
}
