package problems.linkedlists;

/*
Problem:

You have a linked list ↴ and want to find the kkth to last node.

Write a method kthToLastNode() that takes an integer kk and the headNode of a singly-linked list, and returns the kkth to last node in the list.

For example:

  public class LinkedListNode {

    public String value;
    public LinkedListNode next;

    public LinkedListNode(String value) {
        this.value = value;
    }
}

LinkedListNode a = new LinkedListNode("Angel Food");
LinkedListNode b = new LinkedListNode("Bundt");
LinkedListNode c = new LinkedListNode("Cheese");
LinkedListNode d = new LinkedListNode("Devil's Food");
LinkedListNode e = new LinkedListNode("Eccles");

a.next = b;
b.next = c;
c.next = d;
d.next = e;

kthToLastNode(2, a);
// returns the node with value "Devil's Food" (the 2nd to last node)

 */
public class KthToLastNode {


    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static LinkedListNode kthToLastNode(int k, LinkedListNode head) {
        // return the kth to last node in the linked list
        return head;
    }

}
