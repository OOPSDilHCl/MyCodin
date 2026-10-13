import java.util.Arrays;
public class NonOverlappingIntervals{
 public static int fun(int[][] intervals){
    Arrays.sort(intervals,(p,q)->Integer.compare(p[1],q[1]));
    int lastInterval=intervals[0][1], cnt=0, len=intervals.length;
    for(int i=0;i<len;i++){
      if(intervals[i][0]>=lastInterval){
        lastInterval=intervals[i][1];
        cnt++;
      }
    }
    return len-cnt;
  }
  public static void main(String[] args){
   int[][] arr={{1,2},{2,3},{3,4},{1,3}};
   System.out.println(fun(arr));
  }
}