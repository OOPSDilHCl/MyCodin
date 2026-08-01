public class MajorityVotesII{
 public static void main(String[] args){
    int[] arr = {1, 2, 1, 1, 3, 2, 2};
    int candidate1 = 0, candidate2 = 0;
        int vote1 = 0, vote2 = 0;
 // First Pass: Find possible candidates
        for (int num : arr) {
            if (num == candidate1) {
                vote1++;
            }
            else if (num == candidate2) {
                vote2++;
            }
            else if (vote1 == 0) {
                candidate1 = num;
                vote1 = 1;
            }
            else if (vote2 == 0) {
                candidate2 = num;
                vote2 = 1;
            }
            else {
                vote1--;
                vote2--;
            }
        }
        // Second Pass: Verify candidates
        vote1 = 0;
        vote2 = 0;
        for (int num : arr) {
            if (num == candidate1)
                vote1++;
            else if (num == candidate2)
                vote2++;
        }
        int limit = arr.length / 3;
        if (vote1 > limit)
            System.out.println(candidate1);
        if (vote2 > limit)
            System.out.println(candidate2);
    }
}