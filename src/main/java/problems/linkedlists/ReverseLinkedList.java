package problems.linkedlists;

/*
Problem:

Hooray! It's opposite day. Linked lists go the opposite way today.

Write a method for reversing a linked list. ↴ Do it in place. ↴

Your method will have one input: the head of the list.

Your method should return the new head of the list.

Here's a sample linked list node class:

  public class LinkedListNode {

    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value) {
        this.value = value;
    }
}

 */
public class ReverseLinkedList {

    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static LinkedListNode reverse(LinkedListNode headOfList) {
        // reverse the linked list in place
        return headOfList;
    }
}
