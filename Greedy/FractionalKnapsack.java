import java.util.Arrays;
import java.util.Comparator;
class Item{
  int value,weight;
  double ratio;
  Item(int value,int weight){
    this.value=value;
    this.weight=weight;
    this.ratio=(double) value/weight;
  }
}
public class FractionalKnapsack{
  public static double getMaxValue(int[] values,int[] weights,int capacity){
    int n=values.length;
    Item[] items=new Item[n];
    for(int i=0;i<n;i++){
      items[i]=new Item(values[i], weights[i]);
    }
   Arrays.sort(items,new Comparator<Item> (){
     public int compare(Item a,Item b){
       return Double.compare(b.ratio,a.ratio);
     }
   });
    double totalValue=0;
    int remCapacity=capacity;
    for(Item item : items){
      if(item.weight <= remCapacity){
        totalValue += item.value;
        remCapacity -= item.weight;
      } else {
        totalValue += item.ratio*remCapacity;
        break;
      }
    }
    return totalValue;
  }
  public static void main(String[] args){
    int[] values={60,100,120},weights={10,20,30};
    int capacity=50;
    double maxValue=getMaxValue(values,weights,capacity);
    System.out.printf("Maximum value obtainable = %.6f",maxValue);
  }
}