package week1;

import common.ListNode;

/**
 * 141. 环形链表
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode pre = head.next;
        ListNode next = head.next.next;
        while(pre != next){
            if(next == null || next.next == null){
                return false;
            }
            pre = pre.next;
            next = next.next.next;
        }
        return true;
    }
}
