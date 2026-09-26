import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class KeypadPhone{
  private static final String[] Keys={
    "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
  public static void phoneNumber(int i,StringBuilder sb,String digits,List<String> result){
    if(sb.length()==digits.length()){
      result.add(sb.toString());
      return;
    }
    int index=digits.charAt(i)-'0';
    String s=Keys[index];
    if(s==null) return;
    for(char c:s.toCharArray()){
      sb.append(c);
      phoneNumber(i+1,sb,digits,result);
      sb.deleteCharAt(sb.length()-1);
    }
  }
  public static void main(String[] args){
    String digits="34";
   List<String> result=new ArrayList<>();
    phoneNumber(0,new StringBuilder(),digits,result);
    System.out.println(result);
  }
}