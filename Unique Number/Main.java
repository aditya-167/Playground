#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int solve(int l,int h){
  int count =0;
  for(int i=l;i<=h;i++){
  	int num = i;
    int check[10] = {0};
    while(num){
      if(check[num%10]){break;}
      check[num%10]=1;
      num=num/10;
    }
    if(num==0)
      count++;
  }
  if(count>0)
    cout<<count;
  else
    cout<<"No Unique Number";
}

int main() 
{
  int l,h;
  cin>>l>>h; 
  solve(l,h);
  return 0;
}