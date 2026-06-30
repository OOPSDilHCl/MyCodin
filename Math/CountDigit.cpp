#include<iostream>
using namespace std;
int main()
{
  int n;
  cout << "Enter a number:" << endl;
  cin >> n;
  int c=0;
  if(n==0)
  {
    cout << "Number of digits = " << 1;
    return 0;
  }
  while(n!=0)
  {
    n/=10;
    c++;
  }
  cout << "Number of digits = " << c << endl;
  return 0;
}