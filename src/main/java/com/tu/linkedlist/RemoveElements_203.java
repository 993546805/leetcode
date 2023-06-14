package com.tu.linkedlist;

/**
 * <a href="https://leetcode-cn.com/problems/remove-linked-list-elements/">203. 移除链表元素</a>
 * @author tu
 * @date 2023-06-14 11:00
 */
public class RemoveElements_203 {
    /**
     * 普通写法
     */
    public static ListNode removeElements(ListNode head, int val) {
        // 先处理头结点
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;
        }
        // 处理中间节点
        ListNode item = head;
        while(item.next != null){
            if(item.next.val == val){
                item.next = item.next.next;
            }else{
                item = item.next;
            }
        }
        return head;
    }


    /**
     * 上一个方法的优化写法,添加头结点,不需要处理头结点
     */
    public static ListNode removeElements1(ListNode head, int val) {
        head = new ListNode(val - 1, head);
        ListNode item = head;
        while(item.next != null){
            if(item.next.val == val){
                item.next = item.next.next;
            }else{
                item = item.next;
            }
        }
        return head.next;
    }

    /**
     * 递归写法
     */
    public static ListNode removeElements2(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements2(head.next, val);
        return head.val == val ? head.next : head;
    }
}
