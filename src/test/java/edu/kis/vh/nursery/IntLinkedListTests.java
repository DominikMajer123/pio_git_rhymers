package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;
import edu.kis.vh.nursery.list.IntLinkedList;

public class IntLinkedListTests {
    @Test
    public void testEmptyList() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
    }
}