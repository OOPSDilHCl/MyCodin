public class MinimumMBouquetsBS{
  public static boolean blooms(int arr[],int day,int k,int m){
    int bouquets=0,flowers=0,len=arr.length;
    for(int i=0;i<len;i++){
      if(arr[i]<=day){
        flowers++;
        if(flowers==k){
          bouquets++;
          flowers=0;
          if(bouquets==m){
            return true;
          }
        }
      }else{
        flowers=0;
      }
    }
    return false;
  }
  public static void main(String[] args){
    int arr[]={7,7,7,7,13,11,12,7},m=2,k=3,len=arr.length;
    if((long)k*m>len){
      System.out.println(-1);
      return;
    }
    int lt=Integer.MAX_VALUE,rt=Integer.MIN_VALUE;
    for(int x:arr){
      lt=Math.min(lt,x);
      rt=Math.max(rt,x);
    }
    while(lt<rt){
      int mid=lt+(rt-lt)/2;
      if(blooms(arr,mid,k,m)){
        rt=mid;
      }else{
        lt=mid+1;
      }
    }
    System.out.println(lt);
  }
}