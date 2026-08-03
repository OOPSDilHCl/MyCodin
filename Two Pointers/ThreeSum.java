import java.util.*;
public class ThreeSum{
  public static void main(String[] args){
    int arr[]={-8,2,0,-1,-1,1,6,4},len=arr.length;
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(arr);
    for(int i=0;i<len;i++){
      int lt=i+1,rt=len-1;
      if(i>0 && arr[i]==arr[i-1])
      continue;
      while(lt<rt){
        int sum=arr[i]+arr[lt]+arr[rt];
        if(sum==0){
          ans.add(Arrays.asList(arr[i],arr[lt],arr[rt]));
          lt++;
          rt--;
          while(lt<rt && arr[lt]==arr[lt-1]) lt++;
          while(lt<rt && arr[rt]==arr[rt+1]) rt--;
        }
        else if(sum<0) lt++;
        else rt--;
      }
    }
    System.out.println(ans);
  }
}