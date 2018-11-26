package problems.linkedlists;

import org.junit.Test;
import problems.linkedlists.KthToLastNode.LinkedListNode;

import static org.junit.Assert.*;
import static problems.linkedlists.KthToLastNode.kthToLastNode;

public class KthToLastNodeTest {

    @Test
    public void firstToLastNodeTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 1;
        final LinkedListNode actual = kthToLastNode(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }

    @Test
    public void secondToLastNodeTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 2;
        final LinkedListNode actual = kthToLastNode(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }

    @Test
    public void firstNodeTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 4;
        final LinkedListNode actual = kthToLastNode(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }

    @Test(expected = Exception.class)
    public void kIsGreaterThanLinkedListLengthTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 5;
        kthToLastNode(k, listNodes[0]);
    }

    @Test(expected = Exception.class)
    public void kIsZeroTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 0;
        kthToLastNode(k, listNodes[0]);
    }

    private static LinkedListNode[] valuesToLinkedListNodes(int[] values) {
        final LinkedListNode[] nodes = new LinkedListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new LinkedListNode(values[i]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }

}