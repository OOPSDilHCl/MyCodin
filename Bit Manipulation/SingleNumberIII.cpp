#include <iostream>
#include <vector>
using namespace std;
class SingleNumberIII{	
	public:		
		vector<int> singleNumber(const vector<int>& nums){
      int xr=0;
			for(int num : nums){
        xr^=num;
      }
      xr &= -(unsigned int)xr;
      int g0=0,g1=0;
      for(int num : nums){
        if((num&xr)==0)
          g0^=num;
        else g1^=num;
      }
      if(g0<g1)
        return {g0,g1};
      return {g1,g0};
		}
};
int main(){
  SingleNumberIII obj;
  vector<int> v = obj.singleNumber({1,2,1,3,5,2});
  for(int num : v)
    cout << num << " ";
  cout << "\n";
  return 0;
}