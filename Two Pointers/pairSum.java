import java.util.*;
public class pairSum{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    if(n==0){ System.out.println(0);
    return;
    }
    int[] arr=new int[n];
    //Sorted Array
    for(int i=0;i<n;i++)
    {
      arr[i]=scan.nextInt();
    }
    int target=scan.nextInt();
    Arrays.sort(arr);
    int left=0,right=arr.length-1;
    while(left<right)
    {
    int sum=arr[left]+arr[right];
      if(sum==target)
      {
        System.out.println(arr[left]+","+arr[right]);
        return;
      }
      if(sum<target) left++;
      else right--;
    }
    System.out.println("No pair found.");
  }
}