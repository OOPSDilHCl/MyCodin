import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class ArrayStack {
    private int[] values;
    private int capacity;
    private int top;

    // Build an empty stack with fixed capacity.
    public ArrayStack(int cap) {
        // Stack values are stored in fixed array order.
        values = new int[cap];
        // Capacity gives the maximum allowed stack size.
        capacity = cap;
        // Top starts before index 0 to mark emptiness.
        top = -1;
    }

    // Insert a value at the stack top.
    public void push(int value, List<String> output) {
        // Full capacity blocks another stack value.
        if (top == capacity - 1) {
            output.add("Stack Overflow");
            return;
        }

        // Top moves forward to the next free position.
        top = top + 1;
        // New value becomes the latest stack value.
        values[top] = value;
        // Output records the successful push action.
        output.add("Pushed " + value);
    }

    // Remove and return the current stack top.
    public void pop(List<String> output) {
        // Empty stack blocks removal.
        if (top == -1) {
            output.add("Stack Underflow");
            return;
        }

        // Top value is saved before pointer movement.
        int removedValue = values[top];
        // Top moves backward after removal.
        top = top - 1;
        // Output records the removed value.
        output.add("Popped " + removedValue);
    }

    // Read the current stack top without removal.
    public void peek(List<String> output) {
        // Empty stack has no readable top value.
        if (top == -1) {
            output.add("Stack is Empty");
            return;
        }

        // Top value is read without pointer movement.
        output.add("Top = " + values[top]);
    }

    // Check whether the stack has no values.
    public boolean isEmpty() {
        // Top at -1 means no stack value exists.
        return top == -1;
    }

    // Return the current number of stack values.
    public int size() {
        // Occupied cells equal top plus one.
        return top + 1;
    }
}

class Solution {
    // Return all observed stack operation results.
    public List<String> runStackOperations() {
        // Operation output is collected for the sample.
        List<String> output = new ArrayList<>();
        // Stack capacity bounds the array storage.
        ArrayStack stack = new ArrayStack(4);

        stack.push(10, output);
        stack.push(20, output);
        stack.push(30, output);
        stack.peek(output);
        output.add("Size = " + stack.size());
        stack.pop(output);
        stack.peek(output);
        output.add("Size = " + stack.size());
        output.add("Is Empty = " + stack.isEmpty());

        return output;
    }
}

// Driver code
public class StackUsingArrays {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<String> result = obj.runStackOperations();
        System.out.println(Arrays.toString(result.toArray(new String[0])));
    }
}