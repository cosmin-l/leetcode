package org.cl.problem26;

public class Solution {
//Runtime: 1 ms, faster than 97.86% of Java online submissions for Remove Duplicates from Sorted Array.
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int current = nums[0];
        int index = 1;
        int cursor = 1;
        while (index < nums.length) {
            if (nums[index] != current) {
                nums[cursor] = nums[index];
                current = nums[cursor];
                cursor++;
            }
            index++;
        }
        return cursor;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {0,0,1,1,1,2,2,3,3,4};
//        int[] input = {0, 0, 0, 0, 3};

        System.out.println(solution.removeDuplicates(input));
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
