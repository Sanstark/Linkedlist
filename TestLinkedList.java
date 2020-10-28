import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {
    LinkedListMain testLL = new LinkedListMain();

    @Before
    public void testAdd(){
        testLL.list.addNode(56);
        testLL.list.addNode(30);
        testLL.list.addNode(70);
    }
    @Test
    public void testSearchNode(){
        Assert.assertEquals(30, testLL.list.searchNode(30));
    }
}
