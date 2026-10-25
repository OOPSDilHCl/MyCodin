public class TotalSubstringsWithAllThreeChars{
  public static void main(String[] args){
    String s="abcbac";
    int l=0, r=0, cnt=0, n=s.length();
    if(n<3){
      System.out.println(0);
      System.exit(0);
    }
    int[] map=new int[3];
    for(r=0;r<n;r++){
      map[s.charAt(r)-'a']++;
      while(map[0]>0 && map[1]>0 && map[2]>0){
        cnt += n-r;
        map[s.charAt(l)-'a']--;
        l++;
      }
    }
    System.out.println(cnt);
  }
}