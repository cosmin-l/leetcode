package org.cl.problem3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set charsSet = new HashSet();
        int i = 0, j = 0;
        int maxcount = 0;
        int count = 0;
        while (i < (s.length())){
            if (charsSet.add(s.charAt(i))){
                count++;
                i++;
            }else {
                if (count > maxcount) maxcount = count;
                count = 0;
                charsSet = new HashSet();
                j++;
                i = j;
            }
        }
        return maxcount > count ? maxcount : count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = "abcabcbb";
        String input2 = "aab";
        String input3 = "dvdf";

        System.out.println(solution.lengthOfLongestSubstring(input)); //3
        System.out.println(solution.lengthOfLongestSubstring(input2)); //2
        System.out.println(solution.lengthOfLongestSubstring(input3)); //3


    }
}
