package com.tu.linkedlist;

/**
 * <a href="https://leetcode-cn.com/problems/design-linked-list/">707. 设计链表</a>
 * @author tu
 * @date 2023-06-14 11:25
 */
public class MyLinkedList_707 {

    private int size;
    private ListNode head;

    public MyLinkedList_707() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if(index < 0){
            index = 0;
        }
        size++;
        ListNode prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        size--;
        if (index == 0){
            head = head.next;
            return;
        }
        ListNode prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
}
