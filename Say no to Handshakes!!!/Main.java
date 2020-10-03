#include <iostream>
using namespace std;

void solve(int n){
  	if(n==0)
    {
      cout<<"0"<<endl;
      return;
    }
  	else if(n==1){
     cout<<"0"<<endl; 
    }
  else{
	cout<<n*(n-1)/2<<endl;
    return;
  }
}

int main() 
{
   // Try out your code here
    int t;
  	cin>>t;
  	while(t--){
      int n;
      cin>>n;
      solve(n);
      
    }
}