package org.cl.problem2;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }

    Object[] findCarry(int sum, boolean carry) {
        Object[] result = new Object[2];
        if (sum > 9) {
            result[0] = true;
            result[1] = sum % 10;
            return result;
        } else if (carry) {
            result[0] = false;
            result[1] = ++sum;
            return result;
        }
        result[0] = carry;
        result[1] = sum;
        return result;
    }

    public static void main(String[] args) {
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1_1, l2_1);

        System.out.println(result.val + "->" + result.next.val + "->" + result.next.next.val);

    }

    //
    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // ListNode tmp = null, result = null;
    // tmp = new ListNode(l1.val + l2.val);
    // result = tmp;
    // boolean carry = false;
    // while (l1.next !=null) {
    // l1 = l1.next;
    // l2 = l2.next;
    // int sum = l1.val + l2.val;
    // if (sum > 9){
    // sum = 0;
    // carry = true;
    // } else if (carry){
    // sum ++;
    // }
    // tmp.next = new ListNode(sum);
    // tmp = tmp.next;
    // }
    // return result;
    // }

}