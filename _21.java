
// merge two sorted lists
// merge two sorted linked lists and return it as a sorted list.
// The list should be made by splicing together the nodes of the first two lists.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _21 {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {this.val = val; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            }else  {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (l1 != null) {
            l3.next = l1;
        }
        if (l2 != null) {
            l3.next = l2;
        }return dummy.next;
    }
    public void addToTheLast (ListNode node) {
        ListNode head = null;
        head = node;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            temp.next = node;
        }
    }

    public static void main (String[] args) {
        _21 list1 = new _21();
        _21 list2 = new _21();
        list1.addToTheLast(new ListNode(5));
        list1.addToTheLast(new ListNode(10));
        list2.addToTheLast(new ListNode(15));

        list2.addToTheLast(new ListNode(2));
        list2.addToTheLast(new ListNode(3));
        list2.addToTheLast(new ListNode(20));

    }

}
