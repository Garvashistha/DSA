import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0 ; i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+","+i);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("no pair found");
    }
}
