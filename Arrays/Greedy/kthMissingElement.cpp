#include <iostream>
#include <vector>
using namespace std;
int main()
{
 vector<int> arr={2,5,6,10};
 int k=4,len=arr.size();
 for(int i=0;i<len;i++){
   if(arr[i]<=k){
     k++;
   }else break;
 }
 cout << k << "\n";
 return 0;
}