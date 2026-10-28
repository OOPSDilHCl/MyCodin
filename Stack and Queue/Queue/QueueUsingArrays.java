import java.util.*;

class Solution {
    private int[] arr;
    private int capacity;
    private int size;
    private int front;
    private int rear;

    // Initializes a circular array queue.
    public Solution(int maxSize) {
        capacity = maxSize;
        size = 0;
        front = 0;
        rear = 0;
        arr = new int[capacity];
    }

    // Adds a value at the rear of the queue.
    public void push(int x) {
        // A full circular queue has no reusable slot.
        if (size == capacity) {
            return;
        }

        arr[rear] = x;

        // Rear wraps around to reuse freed positions.
        rear = (rear + 1) % capacity;

        size++;
    }

    // Removes and returns the front value.
    public int pop() {
        // An empty queue has no removable front value.
        if (size == 0) {
            return -1;
        }

        int frontValue = arr[front];

        // Front advances to the next oldest value.
        front = (front + 1) % capacity;

        size--;
        return frontValue;
    }

    // Returns the front value without removal.
    public int peek() {
        // An empty queue has no front value.
        if (size == 0) {
            return -1;
        }

        return arr[front];
    }

    // Checks whether the queue has no values.
    public boolean empty() {
        return size == 0;
    }
}

// Driver code
public class QueueUsingArrays {
    public static void main(String[] args) {
        Solution obj = new Solution(3);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.pop() + " ");
        obj.push(40);
        System.out.println(obj.peek() + " ");
        System.out.println(obj.empty());
    }
}