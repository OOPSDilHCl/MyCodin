import java.util.Stack;
//Uses recursion for another Stack.
public class QueueWithOneStack {
    // The single explicit stack instance
    private Stack<Integer> stack;

    public QueueWithOneStack() {
        stack = new Stack<>();
    }

    /**
     * Enqueue operation: Adds an item to the back of the queue.
     * Time Complexity: O(1)
     */
    public void enqueue(int x) {
        stack.push(x);
    }

    /**
     * Dequeue operation: Removes and returns the item from the front of the queue.
     * Time Complexity: O(n) due to the call stack traversal.
     */
    public int dequeue() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Queue Underflow: The queue is empty.");
        }

        // 1. Pop the top element
        int top = stack.pop();

        // Base case: If this was the last element, it is the bottom of the stack
        // (which represents the oldest/front element of the queue).
        if (stack.isEmpty()) {
            return top;
        }

        // 2. Recursive call: Clear out the rest of the stack to reach the bottom
        int frontElement = dequeue();

        // 3. Push the popped element back to preserve the LIFO structure
        stack.push(top);

        // 4. Return the bottom element that was retrieved from the base case
        return frontElement;
    }

    /**
     * Peek operation: Returns the item from the front of the queue without removing it.
     */
    public int peek() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }

        int top = stack.pop();

        if (stack.isEmpty()) {
            // Push it back before returning
            stack.push(top);
            return top;
        }

        // Recursive call to find the bottom
        int frontElement = peek();

        // Push back the elements we temporarily removed
        stack.push(top);
        
        return frontElement;
    }

    /**
     * Checks if the queue is empty.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        QueueWithOneStack queue = new QueueWithOneStack();

        System.out.println("Enqueuing: 10, 20, 30");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element (peek): " + queue.peek()); // Should be 10

        System.out.println("Dequeued: " + queue.dequeue()); // Should be 10
        System.out.println("Dequeued: " + queue.dequeue()); // Should be 20

        System.out.println("Enqueuing: 40");
        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue()); // Should be 30
        System.out.println("Dequeued: " + queue.dequeue()); // Should be 40
        
        System.out.println("Is queue empty? " + queue.isEmpty()); // Should be true
    }
}
