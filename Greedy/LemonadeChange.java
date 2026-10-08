public class LemonadeChange{
  public static void main(String[] args){
    int[] bills={5,5,10,5,20};
    int five=0,ten=0;
    for(int bill:bills){
      if(bill==5){
        five++;
      }
      else if(bill==10){
        if(five<=0){
          System.out.println("false");
          System.exit(0);
        }
        ten++;
        five--;
      }
      else{
        if(ten>0 && five>0){
          ten--;
          five--;
        }
        else if(five>=3){
          five-=3;
        }
        else{
          System.out.println("false");
          System.exit(0);
        }
      }
    }
    System.out.println("true");
  }
}