package Easy.P21MergeTwoSortedLists;

import Tools.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                currentNode.next = l2;
                l2 = l2.next;
            } else {
                currentNode.next = l1;
                l1 = l1.next;
            }

            currentNode = currentNode.next;
        }

        if (l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
        }

        if (l2 != null) {
            currentNode.next = l2;
            l2 = l2.next;
        }

        return tempNode.next;
    }
}
