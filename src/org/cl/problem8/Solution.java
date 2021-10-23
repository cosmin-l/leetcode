package org.cl.problem8;

import java.util.LinkedList;

public class Solution {


    public int myAtoi(String s) {
        if (s.trim().isEmpty()) return 0;
        boolean positive = true;
        String numberStr = "";
        LinkedList<Character> number = new LinkedList<>();
        for (int i = 0; i< s.length(); i++){
            number.add(s.charAt(i));
        }

        for(int i =0; i< number.size(); i++){
            if(number.get(i) == ' '){
                number.remove(i);
                i--;
            } else break;
        }

        if (number.get(0) == '-') {
            positive = false;
            number.remove(0);
        }else  if (number.get(0) == '+') {
            number.remove(0);
        }

        for (char ch : number) {
            if (Character.isDigit(ch)) {
                numberStr += ch;
            } else break;
        }

        int finalNumber;
        if (numberStr.length() == 0) return 0;
        try{
            finalNumber = Integer.parseInt(numberStr);
        }catch (NumberFormatException e){
            if (positive){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }

        if (!positive){
            return -1 * finalNumber;
        }else {
            return finalNumber;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.validateValue("42", 42);
        solution.validateValue("   -42", -42);
        solution.validateValue("4193 with words", 4193);
        solution.validateValue("words and 987", 0);
        solution.validateValue("-91283472332", -2147483648);
        solution.validateValue("3.14159", 3);
        solution.validateValue("+-12", 0);
        solution.validateValue("+", 0);
        solution.validateValue("   +0 123", 0);
        solution.validateValue("-5-", -5);
        solution.validateValue("-+12", 0);
        solution.validateValue("", 0);
        solution.validateValue(" ", 0);

    }



    void validateValue(String value, int expectedResult){
        int result = myAtoi(value);
        if (result == expectedResult){
            System.out.print("  OK  ");
        }
        else {
            System.out.print("FAILED");
        }
        System.out.println(" Expected: " + expectedResult + ", but got: " + result + ".");
    }
}

