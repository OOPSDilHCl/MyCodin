public class CheckAnagrams{
  public static void main(String[] args){
    String s1="DISTW",s2="SWTDI";
    if(s1.length()!=s2.length()) return;
    int[] freq=new int[26];
    int l1=s1.length(),l2=s2.length();
    for(int i=0;i<l1;i++){
      freq[s1.charAt(i)-65]++; 
    }
    for(int i=0;i<l2;i++){
      freq[s2.charAt(i)-65]--; 
    }
    for(int i=0;i<26;i++){
      if(freq[i]!=0){
        System.out.println("Not a valid anagram!");
        return;
      }
    }
    System.out.println("Valid anagram");
  }
}