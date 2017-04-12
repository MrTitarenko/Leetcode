package Task142_LinkedListCycleII;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;

        long time1 = System.nanoTime();
        ListNode answer = solution.detectCycle(listNode1);
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println((time2 - time1) / 1000);
    }
}

