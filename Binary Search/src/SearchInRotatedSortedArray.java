public class SearchInRotatedSortedArray {
    public static int search(int arr[] , int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low]<arr[mid]){
                if(arr[low] <= target && target <=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target <=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
            int arr[] = {9,12,15,18,21,0,3,6};
        int target = 0;

        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
    }
