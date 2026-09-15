//Fast Power/ Binary Exponentiation/ Exponentiation by Squaring.
public class PowerOpt{
 public static double power(double x,int n){
    if(x==0) return 0;
    if(n==0 || x==1) return 1;
    if(n<0){
      x=1/x;
      n=-n;
    }
    double power=power(x,n/2);
    if(n%2==0) return power*power;
    else return power*power*x;
  }
  public static void main(String[] args){
 System.out.printf("%.4f\n",power(2,10));
 System.out.printf("%.4f\n",power(2,-2));
  }
}