package com.company.linearsearch;

public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	static ListNode createNode(int[] arr, int n) {
		if (n == 0) {
			return null;
		}
		ListNode head = new ListNode(arr[0]);
		ListNode cur = head;
		for (int i = 1; i < n; i++) {
			cur.next = new ListNode(arr[i]);
			cur = cur.next;
		}
		return head;
	}

	static void printLinkedList(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.val+"->");
			cur = cur.next;
		}
		System.out.println("NULL");
	}
}

