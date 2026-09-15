public class CloneLL{
  private static class Node{
    int val;
    Node next,random;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public void clonell(){
    Node curr=this.head;
    while(curr!=null){
      Node next=curr.next;
      Node copy=new Node(curr.val);
      copy.next=next;
      curr.next=copy;
      curr=next;
    }
    curr=this.head;
    while(curr!=null){
      if(curr.random!=null)
       curr.next.random=curr.random.next;
      curr=curr.next.next;
    }
    curr=this.head;
    Node newHead=this.head.next;
    Node copy=newHead;
    while(curr!=null){
      curr.next=curr.next.next;
      copy.next=(copy.next!=null)?copy.next.next:null;
      curr=curr.next;
      copy=copy.next;
    }
    this.head=newHead;
  }
  public void print(){
    StringBuilder sb=new StringBuilder();
    Node curr=this.head;
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public static void main(String[] args){
    CloneLL list=new CloneLL();
    Node n1=new Node(1);
    Node n2=new Node(2);
    Node n3=new Node(3);
    Node n4=new Node(4);
    Node n5=new Node(5);
    n1.next=n2; n2.next=n3; 
    n3.next=n4; n4.next=n5;
    n1.random=null; n2.random=null; 
    n3.random=n4; n4.random=n1;
    n5.random=n2;
    list.head=n1;
    list.clonell();
    list.print();
  }
}