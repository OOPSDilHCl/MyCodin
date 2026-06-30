#include <stdio.h>
int main()
{
 int k,n;
 printf("Enter the length of array:\n");
 scanf("%d",&n);
 int arr[n];
 printf("Enter the elements→\n");
 for(int i=0;i<n;i++)
 {
   scanf("%d",&arr[i]);
 }
 printf("Enter left rotation:");
 scanf("%d",&k);
 for(int i=0;i<k;i++)
 {
 int a0=arr[0];
 for(int i=0;i<n-1;i++)
 {
   arr[i]=arr[i+1];
 }
 arr[n-1]=a0;
 }
 for(int i=0;i<n;i++)
 {
   printf("%d ",arr[i]);
 }
 return 0;
}