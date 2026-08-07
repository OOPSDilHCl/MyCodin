import java.util.*;
public class FindRepeatingAndMissing{
  public static void main(String[] args){
    int arr[]={1,2,3,6,7,5,7},n=arr.length;
    int res[]=new int[2];
    long Sn=n*(n+1)/2;
    long S2n=Sn*(2*n+1)/3;
    long S2=0,S=0;
    for(int i=0;i<n;i++){
      S2+=(long)arr[i]*(long)arr[i];
      S+=arr[i];
    }
    long val1=S-Sn;//x-y
    long val2=S2-S2n;//x²-y²
    val2=val2/val1;//x+y
    long x=(val2+val1)/2;//Repeating→x
    long y=val2-x;//Missing→y.
    res[0]=(int)x;
    res[1]=(int)y;
    System.out.println(Arrays.toString(res));
  }
}