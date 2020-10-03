#include <iostream>
#include <bits/stdc++.h>
#include <set>
#include <cmath>
using namespace std;

bool isPrime(int n){
 for(int idx=2;idx<=sqrt(n);idx++){
   if(n%idx==0)
     return false;
 }
  return true;
}

void solve(int l,int h){
  set<int> s;
  int count = 0;
  for(int i=l;i<=h;i++){
  if(isPrime(i))
    s.insert(i);
  }
  for(auto i:s){
    if(s.find(i+6)!=s.end())
    {
      count++;
    }
  }
  if(count>0)
    cout<<count<<endl;
  else
    cout<<"No Prime Pairs"<<endl;
}

int main() 
{
   // Try out your code here
    int l,h;
 	cin>>l>>h;
  	solve(l,h);
  return 0;
}