 package TwoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // Initialize ans to null to indicate no solution found initially
        int[] ans = null;
        // HashMap to store the value and its index
        HashMap<Integer, Integer> mp = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Calculate the partner value that would sum with nums[i] to target
            int partner = target - nums[i];
            // Check if partner value is already in the HashMap
            if (mp.containsKey(partner)) {
                // If found, initialize ans with the indices of the two numbers
                ans = new int[]{mp.get(partner), i};
                return ans; // Return the result immediately
            }
            // Store the current value and its index in the HashMap
            mp.put(nums[i], i);
        }
        // Return ans, which will be null if no solution was found
        return ans;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]); // should print "Indices: 0, 1"
        } else {
            System.out.println("No solution found");
        }
    }
}
