#include <iostream>
using namespace std;

int solve(int n,int p){
 
  int value=0;
  while(n!=0){
   n=n/p;
    value = value + n;
  }
  return value;
  
}

int main() 
{
  int t;
   cin>>t;
  while(t--){
    int n;
    int p;
    cin>>n>>p;
    int value = solve(n,p);
    cout<<value<<endl;
  }
}