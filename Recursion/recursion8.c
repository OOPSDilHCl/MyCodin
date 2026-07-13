#include <stdio.h>
int binsearch(int a[],int key,int beg,int end)//only sorted array.
{
  if(beg>end)
  return -1;
  int mid=(beg+end)/2;
  if(a[mid]==key)
  return mid;
  else if(a[mid]<key)
  return binsearch(a,key,mid+1,end);
  else
  return binsearch(a,key,beg,mid-1);
}
int main()
{
  int ele,n,i;
  printf("Enter the number of elements:");
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  printf("Enter the element to check:");
  scanf("%d",&ele);
  int key=binsearch(arr,ele,0,n-1);
  if(key==-1)
  printf("Search was unsuccessful");
  else
  printf("Element %d found at location %d",arr[key],key+1);
  return 0;
}