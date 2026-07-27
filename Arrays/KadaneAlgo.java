import java.util.Arrays;
public class KadaneAlgo{
  public static void main(String[] args){
    int[] arr={2,3,-7,4,7,-4};
    int len=arr.length,sum=0,max=Integer.MIN_VALUE,start=0,lt=-1,rt=-1;
    for(int i=0;i<len;i++){
      if(sum==0){
        start=i;
      }
      sum+=arr[i];
      if(sum>max){
        max=sum;
        lt=start;
        rt=i;
      }
      if(sum<0){
        sum=0;
      }
    }
    System.out.println(max);
    System.out.println(Arrays.toString(Arrays.copyOfRange(arr,lt,rt+1)));
  }
}