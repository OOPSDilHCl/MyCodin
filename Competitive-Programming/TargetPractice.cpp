#include <iostream>
#include <algorithm>
using namespace std;
int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  int t;
  cin >> t;
  while(t--){
    long long score=0;
    for(int i=0;i<10;i++){
      string row;
      cin >> row;
      for(int j=0;j<10;j++){
        if(row[j]=='X' || row[j]=='x'){
          int val=min({i,j,9-i,9-j})+1;
          score+=val;
        }
      }
    }
    cout << score << "\n";
  }
  return 0;
}