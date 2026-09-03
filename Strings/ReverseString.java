public class ReverseString{
  public static void main(String[] args){
    String s="  welcome to the jungle     ",answer="";
    int i=s.length()-1;
    while(i>=0){
      while(i>=0 && s.charAt(i)==' '){
        i--;
      }
      if(i<0) break;
      int end=i;
      while(i>=0 && s.charAt(i)!=' '){
        i--;
      }
      if(!answer.equals("")){
        answer+=" ";
      }
      answer+=s.substring(i+1,end+1);
    }
    System.out.println(answer);
  }
}