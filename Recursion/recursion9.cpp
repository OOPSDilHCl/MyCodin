#include <iostream>
int power(int x,int n)//stack height=logn
{
  if(n==0) return 1;
  if(x==0) return 0;
  int power=power(x,n/2);
  if(n%2==0) 
   return power*power; 
  else 
   return power*power*x;
}
int main()
{
 int x,n;
 std::cout<<"Enter the base and power:";
 std::cin>>x>>n;
 std::cout<<x<<"^"<<n<<"="<<power(x,n);
 return 0;
}