package problems.linkedlists;

import org.junit.Test;
import problems.linkedlists.ReverseLinkedList.LinkedListNode;

import static org.junit.Assert.*;
import static problems.linkedlists.ReverseLinkedList.reverse;

public class ReverseLinkedListTest {

    @Test
    public void shortLinkedListTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2});
        final LinkedListNode result = reverse(nodes[0]);
        assertTrue(isListReversed(result, nodes));
    }

    @Test
    public void longLinkedListTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4, 5, 6});
        final LinkedListNode result = reverse(nodes[0]);
        assertTrue(isListReversed(result, nodes));
    }

    @Test
    public void oneElementLinkedListTest() {
        final LinkedListNode node = new LinkedListNode(1);
        final LinkedListNode result = reverse(node);
        assertSame(node, result);
    }

    @Test
    public void emptyLinkedListTest() {
        final LinkedListNode result = reverse(null);
        assertNull(result);
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

    private static boolean isListReversed(LinkedListNode list, LinkedListNode[] originalNodes) {
        int i = originalNodes.length - 1;
        while (list != null && i >= 0) {
            if (originalNodes[i] != list) {
                return false;
            }
            list = list.next;
            i--;
        }
        return list == null && i == -1;
    }


}