package org.cl.problem771;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        byte[] JBytes = J.getBytes();
        byte[] SBytes = S.getBytes();

        int count = 0;
        for (int i = 0; i < JBytes.length; i++) {
            for (int j = 0; j < SBytes.length; j++) {
                if (JBytes[i] == SBytes[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        Solution solution = new Solution();
        System.out.println(solution.numJewelsInStones(J, S));
    }
}
