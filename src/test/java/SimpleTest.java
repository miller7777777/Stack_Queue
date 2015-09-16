import mnz.miller777.Queue;
import mnz.miller777.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mille_000 on 17.09.2015.
 */
public class SimpleTest {

    @Test
    public void checkQueue() {
        Queue<String> queue = new Queue<String>();
        queue.put("Hello");
        queue.put("world");

        assertEquals("Hello", queue.get());
        assertEquals("world", queue.get());
        assertNull(queue.get());

    }

    @Test
    public void checkStack(){

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
    }




}
