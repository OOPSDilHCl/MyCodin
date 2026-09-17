import java.util.List;
import java.util.ArrayList;
public class GenerateBinaryStrings{
  public static void generateBinStr(int n,String bin,List<String> res){
    int len=bin.length();
     if(len==n){
       res.add(bin);
       return;
     }
     generateBinStr(n,bin+"0",res);
    if(bin.isEmpty()||bin.charAt(len-1)!='1')
     generateBinStr(n,bin+"1",res);
  }
  public static void main(String[] args){
    int n=3;
    List<String> str=new ArrayList<>();
    generateBinStr(n,"",str);
    System.out.println(str);
  }
}