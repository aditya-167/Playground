#include <iostream>
#include <bits/stdc++.h>
#include<vector>
using namespace std;
bool cmp(pair<char,int> a,pair<char,int> b){
 if(a.second == b.second)
   return a.first>b.first;
  return a.second<b.second;
}

int main() 
{
   // Try out your code here
    int t;
  cin>>t;
  while(t--){
    string value;
    cin>>value;
   int f[26]={0};
    for(int i=0;i<value.length();i++){
     f[value[i]-'a']++; 
    }
    vector<pair<char,int>> sol;
    for(int i=0;i<26;i++){
     sol.push_back({i+'a',f[i]}); 
    }
    sort(sol.begin(),sol.end(),cmp);
    
    for(auto i : sol){
    cout<<i.first<<" ";
    }
    cout<<endl;
  }
}