#include <iostream>
using namespace std;

int solve(int i,int j,int m,int n){
if(i==m-1 && j==n-1)
  return 1;
if(i>m-1 || j>n-1)
  return 0;

  return solve(i+1,j,m,n) + solve(i,j+1,m,n);
}

int main() 
{
   // Try out your code here
    int m,n;
  cin>>m>>n;
  int sol = solve(0,0,m,n);
  cout<<sol;
  	
}