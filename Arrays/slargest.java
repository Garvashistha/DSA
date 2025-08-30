public class slargest {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 2, 3, 9};
        int largest = arr[0];
        int secondlargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
            System.out.println(secondlargest);
        }
    }
}

