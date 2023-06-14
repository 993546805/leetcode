package com.tu.linkedlist;

/**
 * @author tu
 * @date 2023-06-14 10:57
 */
public class ListNode {
 int val;
 ListNode next;

 ListNode() {
 }

 ListNode(int val) {
  this.val = val;
 }

 ListNode(int val, ListNode next) {
  this.val = val;
  this.next = next;
 }
}
