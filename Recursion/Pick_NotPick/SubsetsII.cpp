#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
void helper(size_t ,vector<vector<int>>& ,vector<int>& ,vector<int>& );
vector<vector<int>> power_set(vector<int> &v){
  vector<vector<int>> res;
  vector<int> cur;
  sort(v.begin(),v.end());
  helper(0,res,v,cur);
  return res;
}
void helper(size_t i,vector<vector<int>>& res,vector<int>& v,vector<int>& cur){
  if(i==v.size()){
    res.push_back(cur);
    return;
  }
  cur.push_back(v[i]);
  helper(i+1,res,v,cur);
  cur.pop_back();
  while((i+1)<v.size() && v[i]==v[i+1]){
    i++;
  }
  helper(i+1,res,v,cur);
}
int main(){
  vector<int> v;
  int in,n;
cout << "Enter size of array: " << "\n";
  cin >> n;
  for(int i=0;i<n && cin>>in;i++){
    v.push_back(in);
  }
  vector<vector<int>> res=power_set(v);
  for(const auto& row:res){
    for(int val:row){
      cout << val << " ";
    }
    cout << "\n";
  }
  return 0;
}