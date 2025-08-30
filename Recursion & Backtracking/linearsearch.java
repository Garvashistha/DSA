public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,54,32,54,76};
        int target = 54;
        System.out.println(search(arr,target,0));
    }
    static boolean search(int arr[], int target ,int index){
        if(index == arr.length-1){
            return true;
        }
        return (arr[0] == target) || search(arr,target,index+1);
    }
}