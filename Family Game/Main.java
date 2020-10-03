#include<bits/stdc++.h>
using namespace std;

int solve(bool family[], string& song,int n){

  int i=0,j=0;
  int length = n;
  while(n!=1){
   if(family[i]==true){
    if(song[j]=='y'){
    	family[i]=false;
      	n--;
      	j++;
    }
    else
      j++;
   }
   i++;
   if(i>=length)
     i=0;
   if(j>=song.length())
     j=0;
}
for(int i=0;i<length;i++){
  if(family[i]==true)
    return i+1;
}
}

int main() 
{
  int n;
  string song;
  cin>>n;
  cin>>song;
  bool family[n];
  for(int i=0;i<n;i++){
  family[i]=true;
  }
  int sol = solve(family,song,n);
  cout<<sol<<endl;
  return 0;
}