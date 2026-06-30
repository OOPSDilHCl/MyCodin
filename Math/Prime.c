#include <stdio.h>
int main()
{
int num;
printf("Enter a number: ");
scanf("%d",&num);
if(num<=1)
  {
  printf("%d is not a prime number",num);
   return 0;
  }
for(int i=2;i*i<=num;i++)
 {
  if(num%i==0)
  {
 printf("%d is not a prime number",num);
   return 0;
  }
 }
 printf("%d is a prime number",num);
 return 0;
}