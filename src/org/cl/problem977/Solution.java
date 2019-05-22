package org.cl.problem977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = { -4, -1, 0, 3, 10 };

        System.out.println(solution.sortedSquares(A));

    }
}
