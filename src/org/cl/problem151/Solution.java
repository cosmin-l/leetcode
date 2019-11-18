package org.cl.problem151;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the sky is blue"));  assert solution.reverseWords("the sky is blue").equals("blue is sky the");
        System.out.println(solution.reverseWords("  hello world!  ")); assert solution.reverseWords("  hello world!  ").equals("world! hello");
        System.out.println(solution.reverseWords("a good   example"));
        assert solution.reverseWords("a good   example").equals("example good a");
    }

    public String reverseWords(String str) {
        str = str.trim();
        String[] strArr = str.split(" ");
        StringBuilder toReturn = new StringBuilder();

        for (int i = strArr.length - 1; i >= 0; i--) {
            if (!strArr[i].isEmpty()) {
                toReturn.append(strArr[i]);
                toReturn.append(" ");
            }
        }
        return toReturn.toString().trim();
    }
}
