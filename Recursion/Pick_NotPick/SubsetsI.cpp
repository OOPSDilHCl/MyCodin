#include <iostream>
#include <vector>
using namespace std;
void helper(int sum, int i,vector<int>& v,vector<int>& res){
  if(i==v.size()){
    res.push_back(sum);
    return;
  }
  helper(sum,i+1,v,res);
  helper(sum+v[i],i+1,v,res);
}
vector<int> subsetsSum(vector<int>& v){
  vector<int> res;
  helper(0,0,v,res);
  return res;
}
int main(){
  int n;
 cout << "Enter size of array: " << "\n";
  cin >> n;
  vector<int> v(n);
  for(int i=0;i<n;i++){
    cin >> v[i];
  }
  vector<int> res=subsetsSum(v);
  cout << "[";
  for(int& element:res){
    cout << element << ",";
  }
  cout << "]";
  return 0;
}