public class IsomorphicString{
  public static void main(String[] args){
    String s="paper",t="title";
    if(s.length()!=t.length()){
   System.out.println("Not isomorphic.");
      return;
    }
    int[] arr1=new int[256],arr2=new int[256];
    int n=s.length();
    for(int i=0;i<n;i++){
      if(arr1[s.charAt(i)]!=arr2[t.charAt(i)]){
        System.out.println("Not isomorphic.");
        return;
      }
      arr1[s.charAt(i)]=i+1;
      arr2[t.charAt(i)]=i+1;
    }
    System.out.println("Isomorphic strings.");
  }
}