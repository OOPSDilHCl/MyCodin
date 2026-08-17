#include <iostream>
#include <vector>
using namespace std;
int main()
{
 ios_base::sync_with_stdio(false);
 cin.tie(nullptr);
 int t;
 cin >> t;
 while(t--){
   int n,m;
   cin >> n >> m;
   vector<int> a(n),b(m);
   for(auto &x:a) cin >> x;
   for(auto &x:b) cin >> x;
   int A=a[0]+n-1;
   int B=b[0]+m-1;
   cout << (B<=A ? 1:2) << "\n";
 }
 return 0;
}