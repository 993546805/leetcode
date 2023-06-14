package com.tu.linkedlist;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-linked-list/">206. 反转链表</a>
 * @author tu
 * @date 2023-06-14 11:47
 */
public class ReverseList_206 {
    /**
     * 双指针
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    /**
     * 递归法
     */
    public static ListNode reverseList1(ListNode head) {
        return reverse(null, head);
    }

    private static ListNode reverse(ListNode prev, ListNode curr) {
        // 如果当前节点是尾结点则返回
        if (curr == null) {
            return prev;
        }
        ListNode temp = curr.next;
        curr.next = prev;
        return reverse(curr, temp);
    }
}
