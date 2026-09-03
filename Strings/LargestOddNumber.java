public class LargestOddNumber{
  public static void main(String[] args){
    String s="0089139282";
    int i=s.length()-1,ind=0;
    while(i>=0){
      if((s.charAt(i)-'0')%2!=0){
        ind=i;
        break;
      }
      i--;
    }
    if(ind==-1){
      System.out.println();
      return;
    }
    i=0;
    while(i<=ind){
      if(s.charAt(i)!='0') break;
      i++;
    }
    System.out.println(s.substring(i,ind+1));
  }
}