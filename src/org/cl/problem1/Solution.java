package org.cl.problem1;

//https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int[] nums = {2, 7, 11, 15};
        int[] nums = { -3, 4, 3, 90 };

        int[] returned = solution.twoSum(nums, 0);
        System.out.println("Solution:" + nums[returned[0]] + "; " + nums[returned[1]]);
    }
}