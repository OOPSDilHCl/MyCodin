import java.util.*;
public class MergeOverlappingSubIntervals{
  public static void main(String args[]){
    int[][] intervals={{1,3},{2,4},{2,6},{8,10},{15,18},{16,17}};
    int len=intervals.length;
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
    List<int[]> result=new ArrayList<>();
    int start=intervals[0][0];
    int end=intervals[0][1];
    for(int i=1;i<len;i++){
      int nextStart=intervals[i][0];
      int nextEnd=intervals[i][1];
      if(nextStart<=end){
        end=Math.max(end,nextEnd);
      }else{
      result.add(new int[] {start,end});
      start=nextStart;
      end=nextEnd;
      }
    }
    result.add(new int[] {start,end});
    for(int[] res : result)
    System.out.println(Arrays.toString(res));
  } 
}