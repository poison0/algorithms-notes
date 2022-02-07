package com.company.linearsearch;

public class ReverseBetween {
	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode resNode = head;
		if (head == null || head.next == null) {
			return head;
		}
		ListNode liftNode = null, rightNode = null, liftNodePro = null, rightNodeNext = null, bHead = head;
		int n = 0;
		while (bHead.next != null) {
			n++;
			if (n == left - 1) {
				liftNodePro = bHead;
			}
			if (n == left) {
				liftNode = bHead;
			}
			if (n == right) {
				rightNode = bHead;
			}
			if (n == right + 1) {
				rightNodeNext = bHead;
			}
			bHead = bHead.next;
		}

		ListNode f = liftNode, q = rightNode;
		while (q.next != null) {
			ListNode next = q.next;
			q.next = f;
			f = q;
			q = next;
		}
		q.next = f;


		liftNode.next = rightNodeNext;

		if (liftNodePro != null) {
			liftNodePro.next = rightNode;
		}else {
			resNode = q;
		}

		return resNode;
	}

	public static void main(String[] args) {
		ListNode node = ListNode.createNode(new int[]{1, 2, 3, 4, 5},5);
		ListNode listNode = new ReverseBetween().reverseBetween(node, 2, 4);
		ListNode.printLinkedList(listNode);
	}
}
