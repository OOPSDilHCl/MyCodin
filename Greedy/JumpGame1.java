public class JumpGame1{
  public static void main(String[] args){
    int[] arr={3,3,2,1,0,5,4};
    int farthestJump=0;
    int i=0;
    while(i<arr.length){
      if(farthestJump < i){
        System.out.println("false");
        System.exit(0);
      }
      farthestJump=Math.max(farthestJump, i+arr[i]);
      i++;
    }
    System.out.println("true");
  }
}