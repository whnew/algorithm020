package week1;

import common.ListNode;

/**
 * 24. 两两交换链表中的节点
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head.next;
        ListNode begin = new ListNode();
        begin.next = head;
        while(begin.next != null && begin.next.next != null){
            ListNode node1 = begin.next;
            ListNode node2 = begin.next.next;
            begin.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            begin = node1;
        }
        return p;
    }

    public ListNode swapPairs1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = head.next;
        ListNode q = swapPairs1(p.next);
        head.next = q;
        p.next = head;
        return p;
    }
}
