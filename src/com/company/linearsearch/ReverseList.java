package com.company.linearsearch;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode f = null, q = head;
		while (q.next != null) {
			ListNode n = q.next;
			q.next = f;
			f = q;
			q = n;
		}
		q.next = f;
		return q;
	}
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
