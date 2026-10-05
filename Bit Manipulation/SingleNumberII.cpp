#include <iostream>
#include <vector>
using namespace std;
class SingleNumberII {
public:
    int singleNumber(const vector<int>& nums){
        int single=0;
        for(int i=0;i<32;i++){
          int sum=0;
          for(int n:nums){
            sum+=((n>>i)&1);
          }
          single+=(sum%3)<<i;
        }
      return single;
    }
};
int main(){
  SingleNumberII obj;
  int ans = obj.singleNumber({1,7,2,1,2,2,1,7,5,7});
  cout << ans << "\n";
  return 0;
}