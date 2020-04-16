package Tools;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static String printNode(ListNode node) {
        String out = "";
        while (node.next != null) {
            out += node.val;
            node = node.next;
        }
        out += node.val;

        return out;
    }
}