import java.util.Set;
import java.util.HashSet;
public class LongestSequence{
  public static void main(String[] args){
    int[] arr={100,2,5,103,4,102,3,1};
    Set<Integer> set=new HashSet<>();
    int len=arr.length,longest=Integer.MIN_VALUE;
    for(int i=0;i<len;i++){
      set.add(arr[i]);
    }
    for(int it : set){
      int cnt=1,x=it;
      if(!set.contains(x-1)){
       while(set.contains(x+1)){
         x+=1;
         cnt++;
       }
      longest=Math.max(longest,cnt);
      }
    }
    System.out.println(longest);
  } 
}