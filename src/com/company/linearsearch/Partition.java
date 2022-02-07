package com.company.linearsearch;

public class Partition {
	public ListNode partition(ListNode head, int x) {
		ListNode max = null, min = null,headMax = null,headMin = null,cur = head;
		while (cur != null) {
			ListNode curPro = cur;
			if (cur.val < x) {
				if (min == null) {
					min = cur;
					headMin = cur;
				}else {
					min.next = cur;
					min = min.next;
				}
				cur = cur.next;
			}else {
				if (max == null) {
					max = cur;
					headMax = cur;
				}else {
					max.next = cur;
					max = max.next;
				}
				cur = cur.next;
			}
			curPro.next = null;
		}
		if (min != null) {
			min.next = headMax;
			return headMin;
		}else {
			return headMax;
		}
	}

	public static void main(String[] args) {
		ListNode node = ListNode.createNode(new int[]{1,4,3,2,5,2},6);
		ListNode partition = new Partition().partition(node, 1);
		ListNode.printLinkedList(partition);
	}
}
