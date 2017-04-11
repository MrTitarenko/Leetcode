package Task237_DeleteNodeInLinkedList;

public class Solution1 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}