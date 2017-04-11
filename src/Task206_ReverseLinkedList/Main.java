package Task206_ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();

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
        ListNode answer = solution.reverseList(listNode1);
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println(answer.next);
        System.out.println(answer.next.next);
        System.out.println(answer.next.next.next);
        System.out.println(answer.next.next.next.next);
        System.out.println((time2 - time1) / 1000);
    }
}

