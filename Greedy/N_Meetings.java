import java.util.Arrays;
import java.util.Comparator;
class Meeting{
  int start, end;
  Meeting(int start, int end){
    this.start=start;
    this.end=end;
  }
}
public class N_Meetings{
  public static int scheduleNMeetings(int[] start, int[] end){
    int len=end.length;
    Meeting[] meet=new Meeting[len];
    for(int i=0;i<len;i++){
    meet[i]=new Meeting(start[i],end[i]);
    }
    Arrays.sort(meet,new Comparator<Meeting>(){
      public int compare(Meeting m1,Meeting m2){
        if(m1.end!=m2.end){
          return Integer.compare(m1.end,m2.end);
        }
        return Integer.compare(m1.start,m2.start);
      }
    });
    int cnt=0,lastMeeting=-1;
    for(Meeting m : meet){
      if(m.start > lastMeeting){
        lastMeeting=m.end;
        cnt++;
      }
    }
    return cnt;
  }
  public static void main(String[] args){
    int[] start={1,3,0,5,8,5},end={2,4,6,7,9,9};
    int n=scheduleNMeetings(start,end);
    System.out.println(n);
  }
}