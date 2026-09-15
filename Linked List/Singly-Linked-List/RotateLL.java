public class RotateLL{
  private static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head;
  public void build(int[] vals){
    Node dummy=new Node(0);
    Node dumm=dummy;
    for(int val:vals){
      dumm.next=new Node(val);
      dumm=dumm.next;
    }
    this.head=dummy.next;
  }
  public void print(){
    Node curr=this.head;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("→");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb);
  }
  public void rotate(int k){
    Node tail=this.head;
    int size=1;
    while(tail.next!=null){
      tail=tail.next;
      size++;
    }
    k=k%size;
    if(k==0) return;
    tail.next=this.head;
    int steps=size-k;
    Node newTail=tail.next;
    for(int i=1;i<steps && newTail!=null;i++){
      newTail=newTail.next;
    }
    this.head=newTail.next;
    newTail.next=null;
  }
  public static void main(String[] args){
    RotateLL list=new RotateLL();
    list.build(new int[]{1,2,3,4,5});
    list.print();
    list.rotate(4);
    list.print();
  }
}