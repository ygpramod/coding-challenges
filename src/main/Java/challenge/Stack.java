package challenge;

import static java.lang.System.arraycopy;

public class Stack {
    private int[] stack;
    private int[] minStack;
    private int stackSize = 0;
    private int minStackSize = 0;

    public Stack() {
        stack = new int[2];
        minStack = new int[2];
    }

    public void push(int element) {
        stack[stackSize] = element;
        if (minStackSize == 0 || minStack[minStackSize - 1] >= stack[stackSize]) {
            minStack[minStackSize] = stack[stackSize];
            minStackSize++;
        }
        stackSize++;
        if (stack.length == stackSize)
            stack = increaseStackSize(stack);
        if (minStack.length == minStackSize)
            minStack = increaseStackSize(minStack);
    }

    private int[] increaseStackSize(int[] oldStack) {
        int[] newStack = new int[oldStack.length * 2];
        arraycopy(oldStack, 0, newStack, 0, oldStack.length);
        return newStack;
    }

    public int peek() {
        if (stackSize == 0) {
            throw new IllegalArgumentException("Nothing present in Stack. Please Push something first to peek or pop");
        }
        return stack[stackSize - 1];
    }

    public int pop() {
        int element = peek();
        stackSize--;
        if(minStack[minStackSize] == element)
            minStackSize --;
        return element;
    }

    public int getMin() {
        return minStack[minStackSize - 1];
    }
}
