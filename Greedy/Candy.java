import java.util.Arrays;
public class Candy{
  public static void main(String[] args){
    int ratings[]={2,4,5,4,3,2,1,4,4,0};
    int len=ratings.length, peak=0, upstreak=0, downstreak=0, total=1;
    for(int i=1;i<len;i++){
      if(ratings[i]>ratings[i-1]){
        upstreak++;
        downstreak=0;
        peak=upstreak;
        total += upstreak+1;
      }
      else if(ratings[i]==ratings[i-1]){
        upstreak = downstreak = peak = 0;
        total += 1;
      } else {
        upstreak=0;
        downstreak++;
        total += downstreak + (downstreak>peak?1:0);
      }
    }
    System.out.println(total);
  } 
}