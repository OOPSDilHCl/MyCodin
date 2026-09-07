public class LengthOfLoop{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public int lengthOfLoop(){
    Node slow=head;
    Node fast=head;
    int c=0;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        c=1;
        slow=slow.next;
        while(slow!=fast){
          c++;
          slow=slow.next;
        }
        return c;
      }
    }
    return 0;
  }
  public static void main(String[] args){
    LengthOfLoop ll=new LengthOfLoop();
    ll.head=new Node(1);
    ll.head.next=new Node(2);
    ll.head.next.next=new Node(3);
    ll.head.next.next.next=new Node(4);
    ll.head.next.next.next.next=new Node(5);
    ll.head.next.next.next.next.next=ll.head.next.next;
   System.out.println(ll.lengthOfLoop());
  }
}