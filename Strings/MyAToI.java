public class MyAToI{
  public static void main(String[] args){
    String a="   -246768.78 Decimal";
    a=a.trim();
    int i=0,sign=1,len=a.length();
    long k=0;
    if(i<len && a.charAt(i)=='-'){
      sign=-1;
      i++;
    }
    if(i<len && a.charAt(i)=='+'){
      sign=1;
      i++;
    }
    for(;i<len;i++){
     if(!Character.isDigit(a.charAt(i))){
        System.out.println(sign*k);
        return;
      }
      k=k*10+(a.charAt(i)-48);
      if(sign*k<=Integer.MIN_VALUE){
        System.out.println(Integer.MIN_VALUE);
        return;
      }
      else if(sign*k>=Integer.MAX_VALUE){
        System.out.println(Integer.MAX_VALUE);
        return;
      }
    }
    System.out.println(sign*k);
  }
}