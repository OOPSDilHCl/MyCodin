import java.util.LinkedList;
import java.util.Queue;

public class StackWithOneQueue {
    // The single explicit queue instance
    private Queue<Integer> queue;

    public StackWithOneQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Push operation: Adds an item to the top of the stack.
     * Time Complexity: O(n) because we rotate the elements.
     */
    public void push(int x) {
        // 1. Get the current size before adding the new element
        int size = queue.size();

        // 2. Add the new element to the back of the queue
        queue.add(x);

        // 3. Dequeue all previous elements and re-enqueue them behind 'x'
        for (int i = 0; i < size; i++) {
            int front = queue.remove();
            queue.add(front);
        }
    }

    /**
     * Pop operation: Removes and returns the item at the top of the stack.
     * Time Complexity: O(1)
     */
    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack Underflow: The stack is empty.");
        }
        return queue.remove();
    }

    /**
     * Top/Peek operation: Returns the item at the top without removing it.
     * Time Complexity: O(1)
     */
    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return queue.peek();
    }

    /**
     * Checks if the stack is empty.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        StackWithOneQueue stack = new StackWithOneQueue();

        System.out.println("Pushing: 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Should be 30

        System.out.println("Popped: " + stack.pop()); // Should be 30
        System.out.println("Popped: " + stack.pop()); // Should be 20

        System.out.println("Pushing: 40");
        stack.push(40);

        System.out.println("Top element: " + stack.top()); // Should be 40
        System.out.println("Popped: " + stack.pop()); // Should be 40
        System.out.println("Popped: " + stack.pop()); // Should be 10

        System.out.println("Is stack empty? " + stack.isEmpty()); // Should be true
    }
}
