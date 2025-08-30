import java.util.Scanner;

public class FirstAndLastOccurrence {

    public static int lowerbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;     // store index
                high = mid - 1;   // move left to find earlier occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int upperbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;     // store index
                low = mid + 1;    // move right to find later occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int arr[] = {1, 2, 3, 4, 5, 5, 6, 7};

        int first = lowerbound(arr, target);
        int last = upperbound(arr, target);

        if (first != -1 && last != -1) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
