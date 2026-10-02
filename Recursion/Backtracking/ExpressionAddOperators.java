import java.util.List;
import java.util.ArrayList;
public class ExpressionAddOperators{
  private List<String> res;
  private String num;
  private int target;
  public List<String> addOperators(String num, int target){
    res=new ArrayList<>();
    this.num=num;
    this.target=target;
    if(num==null||num.length()==0)
      return res;
    dfs(0,"",0L,0L);
    return res;
  }
  private void dfs(int idx,String path,long eval,long last){
    int len=num.length();
    if(idx==len){
      if(eval==target){
        res.add(path);
        return;
      }
    }
    for(int end=idx;end<len;end++){
      if(end>idx && num.charAt(idx)=='0')
        break;
      String s=num.substring(idx,end+1);
      long cur=Long.parseLong(s);
      if(idx==0) dfs(end+1,s,cur,cur);
      else{
      dfs(end+1,path+"+"+s,eval+cur,cur);
     dfs(end+1,path+"-"+s,eval-cur,-cur);
      dfs(end+1,path+"*"+s,eval-last+last*cur,last*cur);
      }
    }
  }
  public static void main(String[] args){
    ExpressionAddOperators sol=new ExpressionAddOperators();
    System.out.println(sol.addOperators("123",6));
    System.out.println(sol.addOperators("232",8));
    System.out.println(sol.addOperators("105",5));
    System.out.println(sol.addOperators("00",0));
    System.out.println(sol.addOperators("123",-22));
    System.out.println(sol.addOperators("123",0));
    System.out.println(sol.addOperators("613",9));
  }
}