import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<List<Integer>> result = generateSubsets(new ArrayList<>(), nums);
        System.out.println(result);  // Prints the power set
    }
    public static List<List<Integer>> generateSubsets(List<Integer> current, List<Integer> remaining) {
        if (remaining.isEmpty()) {
            List<List<Integer>> base = new ArrayList<>();
            base.add(new ArrayList<>(current)); // return one subset
            return base;
        }
        int first = remaining.get(0);
        List<Integer> rest = remaining.subList(1, remaining.size());

        // Include the current element
        List<List<Integer>> include = generateSubsets(new ArrayList<>(current) {{
            add(first);
        }}, rest);
        // Exclude the current element
        List<List<Integer>> exclude = generateSubsets(current, rest);

        // Combine both
        include.addAll(exclude);
        return include;
    }
}
