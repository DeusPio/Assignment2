import junit.framework.TestCase;

public class test1 extends TestCase {

    public void testAdd() {
        additionClass addClass = new additionClass();
        assertEquals(2,addClass.addOne(1));

    }
}
