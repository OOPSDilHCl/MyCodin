import java.util.Arrays;
public class AssignCookies{
  public static void main(String[] args){
    int[] students={1,5,3,3,4},cookies={4,2,1,2,1,3};
    Arrays.sort(students);
    Arrays.sort(cookies);
    int g=0,s=0;
    while(g<students.length && s<cookies.length){
      if(cookies[s]>=students[g]){
        g++;
      }
      s++;
    }
    System.out.println(g);
  }
}