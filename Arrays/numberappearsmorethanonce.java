import java.util.HashSet;
import java.util.Set;

public class numberappearsmorethanonce {
    public void number(int [] arr){
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<arr.length;i++){
            if(s.contains(arr[i])){
                System.out.println(arr[i]);
                return;
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,1,2,2,2};
        numberappearsmorethanonce hi = new  numberappearsmorethanonce();
        hi.number(arr);
    }
}
