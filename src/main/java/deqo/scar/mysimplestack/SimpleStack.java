package deqo.scar.mysimplestack;

import java.util.EmptyStackException;
import java.util.ArrayList;

public class SimpleStack <I> {
    private ArrayList<I> mySimpleStack= new ArrayList<I>();
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){
        return mySimpleStack.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    public int getSize() {
        return mySimpleStack.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(I item) {
        mySimpleStack.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public I peek() throws EmptyStackException {
        return mySimpleStack.get(mySimpleStack.size()-1);
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws​ EmptyStackException if this stack is empty.
     */
    public I pop() throws EmptyStackException {
        return mySimpleStack.remove(mySimpleStack.size()-1);
    }
}
