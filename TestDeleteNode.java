import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDeleteNode {
    LinkedListMain testLL = new LinkedListMain();

    @Before
    public void testAdd(){
        testLL.list.addNode(56);
        testLL.list.addNode(30);
        testLL.list.addNode(70);
        testLL.list.insertNode(40,30);
    }

    @Test
    public void testDeleteNode(){
        testLL.list.deleteNode(40);
        Assert.assertEquals("Deleted Node",3, testLL.list.showSize());
    }
}
