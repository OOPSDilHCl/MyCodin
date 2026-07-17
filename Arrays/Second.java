public class Second{
  public static void main(String args[]){
    int[] arr={7,9,6,4,0,3,2,1,5,8};
    int l=arr.length;
    int secmin=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
    int secmax=Integer.MIN_VALUE,max=Integer.MIN_VALUE;
    for(int i=0;i<l;i++){
      if(arr[i]<min){
        secmin=min;
        min=arr[i];
      } else if(arr[i]!=min && arr[i]<secmin){
        secmin=arr[i];
      }
      if(arr[i]>max){
        secmax=max;
        max=arr[i];
      } else if(arr[i]!=max && arr[i]>secmax){
        secmax=arr[i];
      }
    }
    System.out.println("Greatest="+max+" , Second greatest="+secmax+" ,Smallest="+min+" ,Second smallest="+secmin);
  }
}
