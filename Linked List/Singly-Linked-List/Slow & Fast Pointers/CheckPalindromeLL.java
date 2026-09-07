public class CheckPalindromeLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  public static boolean isPalindrome(Node head){
    if(head==null || head.next==null){
      return true;
    }
    Node slow=head,fast=head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    Node mid=reverse(slow),middle=mid;
    fast=head;
    boolean result=true;
    while(mid!=null){
      if(mid.val!=fast.val){
        result=false;
        break;
      }
      fast=fast.next;
      mid=mid.next;
    }
    slow.next=reverse(middle);
    return result;
  }
  public static Node reverse(Node head){
    Node prev=null,curr=head;
    while(curr!=null){
      Node next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    return prev;
  }
  public static void main(String[] args){
    CheckPalindromeLL ll=new CheckPalindromeLL();
    Node first=new Node(1);
    Node second=new Node(2);
    Node third=new Node(3);
    Node fourth=new Node(2);
    Node fifth=new Node(1);
    first.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    if(isPalindrome(first)){
      System.out.println("List is Palindrome");
    }else{
      System.out.println("List is not Palindrome");
    }
  }
}