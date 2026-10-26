public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        // Phase 1: Find the intersection point of the tortoise and hare
        int tortoise = nums[0];
        int hare = nums[0];
        
        // Move hare at 2x speed and tortoise at 1x speed until they meet
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        
        // Phase 2: Find the entrance to the cycle (the duplicate number)
        // Reset tortoise to the start of the array
        tortoise = nums[0];
        
        // Move both pointers at the exact same speed (1x)
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        // The point where they meet is the duplicate number
        return tortoise;
    }

    // Main method to test the implementation with your example
    public static void main(String[] args) {
        FindDuplicate solver = new FindDuplicate();
        
        // Testing your exact array: [3, 2, 3, 1]
        int[] testArray = {3, 2, 3, 1};
        int duplicate = solver.findDuplicate(testArray);
        
        System.out.println("The duplicate number is: " + duplicate); 
        // Output: The duplicate number is: 3
    }
}
