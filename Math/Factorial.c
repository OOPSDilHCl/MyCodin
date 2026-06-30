#include <stdio.h>
int main ()
{
  int num;
  long long fact=1;
  printf("Enter any number: \n");
  scanf("%d",&num);
  if(num<0)
  {
    printf("Factorial of negative numbers is not defined. ");
    return 0;
  }
  for(int i=2;i<=num;i++)
  {
    fact*=i;
  }
  printf("Factorial of %d = %lld.",num,fact);
  return 0;
}