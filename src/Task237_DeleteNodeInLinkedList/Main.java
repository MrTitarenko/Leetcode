package Task237_DeleteNodeInLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;

        long time1 = System.nanoTime();
        solution.deleteNode(listNode3);
        long time2 = System.nanoTime();

        System.out.println(listNode1);
        System.out.println(listNode1.next);
        System.out.println(listNode1.next.next);
        System.out.println(listNode1.next.next.next);
        System.out.println(listNode1.next.next.next.next);
        System.out.println((time2 - time1) / 1000);
    }
}

