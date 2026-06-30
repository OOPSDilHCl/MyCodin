#include <iostream>
using namespace std;
int main()
{
 int n;
 cout << "Enter a number: " << endl;
 cin >> n;
 int fibo1=1,fibo2=0;
 for(int i=1;i<=n;i++)
 {
   cout << fibo2 << " ";
   int temp=fibo2;
   fibo2 = fibo1+fibo2;
   fibo1=temp;
 }
 return 0;
}