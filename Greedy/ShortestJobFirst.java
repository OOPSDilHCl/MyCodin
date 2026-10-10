import java.util.Arrays;
public class ShortestJobFirst{
  public static void main(String[] args){
    int[] job={4,3,1,7,2};
    int waiting=0,t=0;
    Arrays.sort(job);
    for(int it : job){
      waiting += t;
      t += it;
    }
  System.out.println(waiting/job.length);
  }
}