#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;
int main()
{
 int n,in;
 cout << "Enter number of elements " << endl;
 cin >> n;
 cout << "Enter the elements:" << endl;
 vector<int> list;
 for(int i=0;i<n && cin>>in;i++)
 {
   list.push_back(in);
 }
 unordered_map<int,int> map;
 int maxFrequency=0,maxElement=list[0];
 for(int num : list)
 {
map[num]++;//Set to 0 if key never seen.
   if(map[num] > maxFrequency)
   {
     maxFrequency=map[num];
     maxElement=num;
   }
 }
 cout << maxElement << " Appeared " << maxFrequency << " times in the list." << endl;
 return 0;
}