import java.util.List;
import java.util.ArrayList;
public class PowerSetRecursion{
  public static void powerSet(String s,List<String> res){
  powerSet(s,res,new StringBuilder(),0);
  }
private static void powerSet(String s,List<String> res,StringBuilder subseq,int i){
  if(i==s.length()){
    res.add(subseq.toString());
    return;
  }
  powerSet(s,res,subseq,i+1);
  subseq.append(s.charAt(i));
  powerSet(s,res,subseq,i+1);
  subseq.deleteCharAt(subseq.length()-1);
}
  public static void main(String[] args){
    String s="abc";
    List<String> str=new ArrayList<>();
    powerSet(s,str);
    System.out.println(str);
  }
}