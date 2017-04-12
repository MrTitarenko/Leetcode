package Task141_LinkedListCycle;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (!nodeSet.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}