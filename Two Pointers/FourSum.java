import java.util.*;
public class FourSum{
  public static void main(String[] args){
    int arr[]={4,3,3,4,4,2,1,2,1,1},len=arr.length,target=9;
    List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(arr);
    for(int i=0;i<len-3;i++){
      if(i>0 && arr[i]==arr[i-1])
        continue;
      if((long)arr[i]+arr[i+1]+arr[i+2]+arr[i+3]>target) break;
      if((long)arr[i]+arr[len-1]+arr[len-2]+arr[len-3]<target) continue;
      for(int j=i+1;j<len-2;j++){
        if(j>i+1 && arr[j]==arr[j-1])
         continue;
      if((long)arr[i]+arr[j]+arr[j+1]+arr[j+2]>target) break;
      if((long)arr[i]+arr[j]+arr[len-1]+arr[len-2]<target) continue;
        int lt=j+1,rt=len-1;
        while(lt<rt){
          long sum=(long)arr[i]+arr[j]+arr[lt]+arr[rt];
          if(sum==target){
            ans.add(Arrays.asList(arr[i],arr[j],arr[lt],arr[rt]));
            lt++;
            rt--;
            while(lt<rt && arr[lt]==arr[lt-1]) lt++;
            while(lt<rt && arr[rt]==arr[rt+1]) rt--;
          }
          else if(sum<target) lt++;
          else rt--;
        }
      }
    }
    System.out.println(ans);
  }
}
