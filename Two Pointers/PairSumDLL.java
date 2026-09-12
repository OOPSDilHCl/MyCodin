import java.util.List;
import java.util.ArrayList;
public class PairSumDLL{
  private static class Node{
    int val;
    Node prev,next;
    Node(int val){
      this.val=val;
    }
  }
  private Node head,tail;
  public void build(int[] vals){
    for(int val:vals){
       Node node=new Node(val);
       if(this.head==null){
         this.head=this.tail=node;
       }else{
         node.prev=this.tail;
         this.tail.next=node;
         this.tail=node;
       }
    }
  }
  public void print(){
    Node curr=this.head;
    StringBuilder sb=new StringBuilder("null");
    while(curr!=null){
      sb.append("←→").append(curr.val);
      curr=curr.next;
    }
    sb.append("←→null");
    System.out.println(sb);
  }
  public List<int[]> pairSum(int target){
    Node left=head,right=tail;
    List<int[]> result=new ArrayList<>();
  while(left!=right && left.prev!=right){
      int sum=left.val+right.val;
      if(sum==target){
        result.add(new int[]{left.val,right.val});
        left=left.next;
        right=right.prev;
      }
      else if(sum<target){
        left=left.next;
      }else{
        right=right.prev;
      }
    }
    return result;
  }
  public static void main(String[] args){
    PairSumDLL list=new PairSumDLL();
    list.build(new int[]{1,2,4,5,6,8,9});
    list.print();
    int target=10;
  List<int[]> pairs=list.pairSum(target);
    System.out.print("[");
    for(int[] p:pairs){
      System.out.print("["+p[0]+","+p[1]+"]");
    }
    System.out.print("]");
  }
}