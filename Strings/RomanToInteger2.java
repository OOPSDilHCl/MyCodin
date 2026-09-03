import java.util.Scanner;
import java.util.Map;
public class RomanToInteger2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roman numeral:");
    String s=sc.nextLine().trim().toUpperCase();
    int len=s.length(),num=0;
    Map<Character,Integer> map=Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
    for(int i=0;i<len;i++){
      int next=(i+1<len)?map.get(s.charAt(i+1)):0;
      int curr=map.get(s.charAt(i));
      num+=(curr<next)?-curr:curr;
    }
    System.out.println(num);
  }
}