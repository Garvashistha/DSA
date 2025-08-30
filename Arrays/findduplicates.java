import java.util.HashSet;

public class findduplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 4, 5, 6, 9, 7};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i : arr) {
            if (!seen.add(i)) {
                duplicates.add(i);
            }
        }
            System.out.println(duplicates);
    }
}