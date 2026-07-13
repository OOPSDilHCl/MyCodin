#include <stdio.h>//Fibonacci series
int fibo(int n)//2^n time complexity.
{
  if(n==0)
  return 0;
  else if(n==1)
  return 1;
  else
  return fibo(n-1)+fibo(n-2);
}
int main()
{
  int n,i;
  printf("Enter the number of terms:");
  scanf("%d",&n);
  for(i=0;i<=n;i++)
  {
   printf("%d\t",fibo(i));
  }
  return 0;
}