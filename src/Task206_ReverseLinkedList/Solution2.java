package Task206_ReverseLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head != null) {
            List<Integer> arr = new ArrayList<>();
            for (ListNode node = head; node != null; node = node.next) {
                arr.add(node.val);
            }
            ListNode listNode = head;
            for (int k = arr.size() - 1; k >= 0; k--) {
                listNode.val = arr.get(k);
                listNode = listNode.next;
            }
        }
        return head;
    }
}