public class List{
  public static void main(String[] args){
    List list=new List();
    System.out.println("List:");
    list.print();
    list.lengthOfList();
    list.addFirst(4);
    list.addFirst(3);
    System.out.println("List:");
    list.print();
    list.lengthOfList();
    list.addFirst(2);
    list.addFirst(1);
    System.out.println("List:");
    list.print();
    list.lengthOfList();
    list.addFirst(6);
    list.addFirst(9);
    System.out.println("List:");
    list.print();
    list.lengthOfList();
    list.search(3);
    list.search(6);
    list.search(5);
  }
  Node head;
  public static class Node{
    int val;
    Node next;
    Node(int val){
      this.val=val;
    }
  }
  public void addFirst(int val){
    Node newNode=new Node(val);
    newNode.next=head;
    head=newNode;
  }
  public void print(){
    if(head==null){
      System.out.println("null");
      return;
    }
    Node curr=head;
    StringBuilder sb=new StringBuilder();
    while(curr!=null){
      sb.append(curr.val).append("->");
      curr=curr.next;
    }
    sb.append("null");
    System.out.println(sb.toString());
  }
  public void lengthOfList(){
    int len=0;
    Node curr=head;
    while(curr!=null){
      curr=curr.next;
      len++;
    }
    System.out.println(len);
  }
  public void search(int target){
    if(head==null){
      System.out.println("List empty!");
      return;
    }
    Node curr=head;
    while(curr.val!=target&&curr.next!=null){
      curr=curr.next;
    }
    if(curr.val==target){
      System.out.println("Number is present in list.");
    }
    else System.out.println("Number not found in list.");
  }
}