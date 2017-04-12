package Task142_LinkedListCycleII;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (!nodeSet.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}