import java.util.Arrays;
public class MinimumPlatforms{
  public static void main(String[] args){
    int[] arrivals={900,940,950,1100,1500,1800}, departure={910,1200,1120,1130,1900,2000};
    Arrays.sort(departure);
    int i=0, j=0, len=arrivals.length, cnt=0, maxcnt=0;
    while(i<len){
      if(arrivals[i]<=departure[j]){
        i++;
        cnt++;
      }
      else{
        j++;
        cnt--;
      }
      maxcnt=Math.max(cnt, maxcnt);
    }
    System.out.println(maxcnt);
  }
}