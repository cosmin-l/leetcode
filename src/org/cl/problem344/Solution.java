package org.cl.problem344;

class Solution {

    public void reverseString(char[] s) {
        if (s.length > 1)
            for (int i = 0; i <= (s.length / 2) - 1; i++) {
                char tmp = s[s.length - i - 1];
                s[s.length - i - 1] = s[i];
                s[i] = tmp;
            }
    }

    public static void main(String[] args) {
        doAndPrint(new char[] { 'h', 'e', 'l', 'l', 'o' });
        doAndPrint(new char[] { 'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ',
                'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a' });
        doAndPrint(new char[] { 'a', '.' });
        doAndPrint(new char[] { 'a', ' ', 'b', 'a' });
    }

    private static void doAndPrint(char[] input) {
        Solution solution = new Solution();
        solution.reverseString(input);
        for (char ch : input) {
            System.out.print(ch);
        }
        System.out.println();
    }
}