import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class InsertIntervals{
  public static int[][] insert(int[][] intervals, int[] newInterval){
    List<int[]> res=new ArrayList<>();
    int i=0, n=intervals.length;
    while(i<n && intervals[i][1]<newInterval[0]){
      res.add(intervals[i]);
      i++;
    }
    while(i<n && intervals[i][0]<=newInterval[1]){
      newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
      newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
      i++;
    }
    res.add(newInterval);
    while(i<n){
      res.add(intervals[i]);
      i++;
    }
    return res.toArray(new int[res.size()][]);
  }
  public static void main(String[] args){
    int[][] intervals={{-1,0},{2,4},{6,9},{11,13}};
    int[] newInterval={-2,2};
    int[][] answer=insert(intervals, newInterval);
    System.out.println(Arrays.deepToString(answer));
  }
}