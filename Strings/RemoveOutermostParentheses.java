public class RemoveOutermostParentheses{
  public static void main(String[] args){
    StringBuilder sb=new StringBuilder();
    int level=0;
    String str="((()))(()())(())";
    for(char ch:str.toCharArray()){
      if(ch=='('){
        if(level>0){
          sb.append(ch);
        }
        level++;
      }else if(ch==')'){
        level--;
        if(level>0){
          sb.append(ch);
        }
      }
    }
    System.out.println(sb);
  }
}