import java.util.*;
import java.util.List;
public class Sample1 {
    public static void main(String[] args){
       // Initialize the first array.
       int[] nums1 = {1, 2, 3, 4};
       System.out.println("\nOriginal array 1: " + Arrays.toString(nums1));
       // Calculate and display the permutations of the first array.
       List<List<Integer>> result1 = new Sample1().permute(nums1);
       System.out.println("\nPossible permutations of the first array:");
       result1.forEach(System.out::println);

    }
    public List<List<Integer>>permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Permutation(0, nums, result);
        return result;
    }

    // Recursive method to generate permutations.
    private void Permutation(int i, int[] nums, List<List<Integer>> result) {
        if (i == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) list.add(n);
            result.add(list);
        } else {
            for (int j = i, l = nums.length; j < l; j++) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                Permutation(i + 1, nums, result);
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
    }


    //  public static void swap(List<Integer> sl, int i, int j) {
    //     int temp = sl.get(i);
    //     sl.set(i, sl.get(j));
    //     sl.set(j, temp);
    // }
    
}
