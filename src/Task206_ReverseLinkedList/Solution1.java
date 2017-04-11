package Task206_ReverseLinkedList;

import java.util.*;

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head != null) {
            Deque<ListNode> que = new LinkedList<>();
            List<Integer> arr = new ArrayList<>();
            que.add(head);
            while (!que.isEmpty()) {
                ListNode node = que.pop();
                arr.add(node.val);
                if (node.next != null) {
                    que.offer(node.next);
                }
            }
            que.add(head);
            int i = 1;
            while (!que.isEmpty()) {
                ListNode node = que.pop();
                node.val = arr.get(arr.size() - i++);
                if (node.next != null) {
                    que.offer(node.next);
                }
            }
        }
        return head;
    }
}