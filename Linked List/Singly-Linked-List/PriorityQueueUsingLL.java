public class PriorityQueueUsingLL{
  private static class Node{
    int data,priority;
    Node next;
    Node(int data,int priority){
      this.data=data;
      this.priority=priority;
    }
  }
  private Node head;
  public void print(){
    StringBuilder sb=new StringBuilder();
    Node curr=this.head;
    while(curr!=null){
      sb.append(curr.data).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public void insertPQ(int data,int priority){
    Node dummy=new Node(-1,-1);
    dummy.next=this.head;
    Node curr=dummy;
    Node newNode=new Node(data,priority);
    while(curr.next!=null && curr.next.priority<=priority){
      curr=curr.next;
    }
    newNode.next=curr.next;
    curr.next=newNode;
    this.head=dummy.next;
  }
  public static void main(String[] args){
    PriorityQueueUsingLL list=new PriorityQueueUsingLL();
    list.insertPQ(60,5);
    list.insertPQ(50,4);
    list.insertPQ(20,2);
    list.insertPQ(10,1);
    list.insertPQ(30,2);
    list.insertPQ(40,3);
    list.print();
  }
}