import java.util.*;

public class IntegerPairs {

    public static void findPairs(int[] arr, int target) {
        Set<Integer> set = new HashSet<Integer>();
        Set<String> result = new HashSet<String>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) {
                int[] pair = new int[] {arr[i], complement};
                Arrays.sort(pair);
                result.add(Arrays.toString(pair));
            }
            set.add(arr[i]);
        }

        for (String pair : result) {
            System.out.println(pair);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 5, 1, 4};
        int target = 7;

        System.out.println("Pairs that sum up to " + target + ": ");
        findPairs(arr, target);
    }
}