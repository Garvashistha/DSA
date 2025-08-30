public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {23,34,45,56,67,79};
        int target = 56;
        int result = bs(arr,0,arr.length-1,target);
                if(result == -1){
                    System.out.println("Element not found");
                }
                else{
                    System.out.println("element found at : " + result);
                }
    }
    static int bs(int arr[] , int low , int high , int target){
        if(low>high){
            return -1;
        }
        int mid = (low+high) /2;
        if(arr[mid] == target){
            return mid;
        }
        else if (target<arr[mid]) {
            return bs(arr,0,mid-1,target);
        }
        else{
            return bs(arr,mid+1,arr.length-1,target);
        }
    }
}
