public class largestelement {
    public static void main(String[] args) {
        int[] arr={2,6,4,7,1};
        int largest = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}