#include <stdio.h>
#include <math.h>
int main()
{
  int num,c=0,pro=1,arm1=0;
  printf("Enter a number: ");
  scanf("%d",&num);
  int n=num;
  do //so that 0 is counted as 1 digit.
  {
    c++;
    n/=10;
  }while(n>0);
  n=num;
  while(n>0)
  {
    pro=1;
    for(int i=1;i<=c;i++)
    {
      pro=pro*(n%10);
    }
    n=n/10;
    arm1=arm1+pro;
  }
  if(arm1==num)
printf("%d is an Armstrong number.",num);
  else
printf("%d is not an Armstrong number.",num);
  return 0;
}