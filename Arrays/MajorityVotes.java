public class MajorityVotes{
  public static void main(String[] args){
    int[] arr={4,9,9,4,4,2,4,0,4};
    int len=arr.length,cnt=0,ele=arr[0];
    for(int i=0;i<len;i++){
      if(cnt==0){
        cnt=1;
        ele=arr[i];
      }
      else if(ele==arr[i]){
        cnt++;
      }
      else cnt--;
    }
    cnt=0;
    for(int num : arr){
      if(num==ele) cnt++;
    }
    if(cnt > (len/2)){
      System.out.println(ele);
    }
  }
}