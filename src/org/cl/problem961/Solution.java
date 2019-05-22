package org.cl.problem961;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int repeatedNTimes(int[] A) {
        Set<Integer> intSet = new HashSet();
        for (int elem : A) {
            if (!intSet.add(elem))
                return elem;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 2, 3, 3 };
        int[] input2 = { 2, 1, 2, 5, 3, 2 };
        int[] input3 = { 5, 1, 5, 2, 5, 3, 5, 4 };

        Solution solution = new Solution();

        System.out.println(solution.repeatedNTimes(input1));
        System.out.println(solution.repeatedNTimes(input2));
        System.out.println(solution.repeatedNTimes(input3));

    }
}
