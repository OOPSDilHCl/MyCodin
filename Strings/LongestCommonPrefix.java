import java.util.Arrays;
public class LongestCommonPrefix{
  public static void main(String[] args){
    StringBuilder sb=new StringBuilder();
  String[] str={"flower","flow","flood"};
   if(str.length==0 || str==null){
     return;
   }
   Arrays.sort(str);
   String f=str[0],l=str[str.length-1];
   int i=0;
   int minLen=Math.min(f.length(),l.length());
   while(i<minLen && f.charAt(i)==l.charAt(i)){
     i++;
   }
   System.out.println(f.substring(0,i));
  }
}