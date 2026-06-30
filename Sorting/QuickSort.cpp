#include <iostream>
#include <vector>
using namespace std;
void printArray(vector<int>& arr,int n){
  for(int i=0;i<n;i++){
    cout << arr[i] << " ";
  }
  cout << endl;
}
void swapping(int& a,int& b){
  int temp=a;
  a=b;
  b=temp;
}
int hoarePartitionScheme(vector<int>& arr,int low,int high){
  int i=low-1,j=high+1,pivot=arr[low];
  while(true){
  do{
    i++;
  }while(arr[i]<pivot);
  do{
    j--;
  }while(arr[j]>pivot);
  if(i>=j) return j;
  swapping(arr[i],arr[j]);
  }
}
void quickSort(vector<int>& arr,int low,int high){
  if(low<high){
    int pivot=hoarePartitionScheme(arr,low,high);
    quickSort(arr,low,pivot);
    quickSort(arr,pivot+1,high);
  }
}
int main(){
  int n,input;
  cout<<"Enter length of array: "<<endl;
  cin >> n; 
  cout << "Enter the elements: " << endl;
  vector<int> arr;
  for(int i=0;i<n && cin>>input;i++){
    arr.push_back(input);
  }
  cout << "Original Array: " << endl;
  printArray(arr,n);
  quickSort(arr,0,n-1);
  cout << "Sorted Array: " << endl;
  printArray(arr,n);
  return 0;
}