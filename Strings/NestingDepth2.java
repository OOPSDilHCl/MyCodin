public class NestingDepth2{
  public static void main(String[] args){
    String s="(1+(2*3)+((8)/4))+1*2+((((8))5*(6)))";
    int level=0,len=s.length(),max=0;
    for(char ch:s.toCharArray()){
      if(ch=='('){
        level++;
        max=Math.max(level,max);
      }else if(ch==')'){
        level--;
      }
    }
    System.out.println(max);
  }
}