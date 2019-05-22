package org.cl.problem1002;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList();
        for (int j = 0; j < A[0].length(); j++) {
            int count = 0;
            for (int i = 1; i < A.length; i++) {
                if (A[i].contains("" + A[0].charAt(j))) {
                    A[i] = A[i].replaceFirst("" + A[0].charAt(j), "");
                    count++;
                }
            }
            if (count == A.length - 1) {
                result.add("" + A[0].charAt(j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // String[] input1 = new String[] { "bella", "label", "roller" };

        String[] input2 = new String[] { "cool", "lock", "cook" };

        // List<String> output1 = solution.commonChars(input1);

        List<String> output2 = solution.commonChars(input2);

        // System.out.println("solution1: ");
        // for (String str : output1) {
        // System.out.print("\"" + str + "\", ");
        // }

        System.out.println("solution2: ");
        for (String str : output2) {
            System.out.print("\"" + str + "\", ");
        }
    }
}