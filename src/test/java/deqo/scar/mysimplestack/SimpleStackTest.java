package deqo.scar.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {
    SimpleStack<Integer> stack;

    @Before
    public void initialize() {
        stack= new SimpleStack<Integer>();
    }

    @Test
    public void isEmpty() throws Exception {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals(0, stack.getSize());
        stack.push(1);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void push() throws Exception {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void peek() throws Exception {
        stack.push(1);
        assertEquals("1", stack.peek().toString());
    }

    @Test
    public void pop() throws Exception {
        stack.push(1);
        assertEquals("1", stack.pop().toString());
        assertTrue(stack.isEmpty());
    }

}