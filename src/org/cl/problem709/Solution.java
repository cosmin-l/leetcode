package org.cl.problem709;

public class Solution {
    public String toLowerCase(String str) {
        byte[] strBytes = str.getBytes();
        for (int i = 0; i < strBytes.length; i++) {
            strBytes[i] = (((strBytes[i] > (byte) 64) && ((strBytes[i] < (byte) 91))) ? (byte) (strBytes[i] + 32)
                    : (strBytes[i]));
        }

        return new String(strBytes);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input1 = "Hello";
        String input2 = "here";
        String input3 = "LOVELY";

        System.out.println(solution.toLowerCase(input1));
        System.out.println(solution.toLowerCase(input2));
        System.out.println(solution.toLowerCase(input3));
    }
}
