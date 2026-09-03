#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;
class Solution{
  private:
    static bool comparator(pair<int,char> p1,pair<int,char> p2){
      if(p1.first<p2.first){
        return false;
      }
      if(p1.first>p2.first){
        return true;
      }
      return p1.second<p2.second;
    }
  public: 
    vector<char> freqSort(string s){
      pair<int,char> freq[26];
      for(int i=0;i<26;i++){
        freq[i]={0,(char)'a'+i};
      }
      for(char ch:s){
        freq[ch-'a'].first++;
      }
      sort(freq,freq+26,comparator);
      vector<char> ans;
      for(int i=0;i<26;i++){
        if(freq[i].first>0){
          ans.push_back(freq[i].second);
        }
      }
      return ans;
    }
};
int main(){
  Solution sol;
  string s="trestzzz";
  vector<char> res=sol.freqSort(s);
  for(char c:res){
    cout << c << " ";
  }
  return 0;
}