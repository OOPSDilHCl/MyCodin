public class StartingOfLoop{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public static void main(String[] args){
    StartingOfLoop list=new StartingOfLoop();
    list.head=new Node(1);
    list.head.next=new Node(2);
    list.head.next.next=new Node(3);
    list.head.next.next.next=new Node(4);
    list.head.next.next.next.next=new Node(5);
    list.head.next.next.next.next.next=list.head.next;
    Node slow=list.head,fast=list.head;
    while(fast!=null && fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        slow=list.head;
        while(slow!=fast){
          slow=slow.next;
          fast=fast.next;
        }
        System.out.println(slow.val);
        return;
      }
    }
    System.out.println("null");
  }
}