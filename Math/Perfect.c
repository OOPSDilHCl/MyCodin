#include <stdio.h>
int main()
{
  int n,sum=1;
  printf("Enter a number: \n");
  scanf("%d",&n);
  printf("%d",sum);
  for(int i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
    printf("+%d",i);
    sum=sum+i;
    }
  }
  if(sum==n)
printf("=%d→%d is a perfect number.",sum,n);
  else
printf("=%d→%d is not a perfect number.",sum,n);
return 0;
}