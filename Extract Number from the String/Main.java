#include <iostream>
using namespace std;

string solve(string& testcase){
	string res ="";
  	
  for(int i=0;i<testcase.length();i++){
    string num = "";
    int n9 = 0;
  	while(testcase[i]>='0' && testcase[i]<='9'){
    	if(testcase[i]=='9')
          n9 = 1;
      	num = num + testcase[i];
      	i++;
    }
    if(!n9 && num!=""){
  	long long a = stoll(num);
    long long b = -1;
    if(res!="")
      b = stoll(res);
    if(a>b)
      res = num;
    
    }
  }
  if(res!="")
    return res;
  else
    return "-1";
  
  
}

int main() 
{
  int t;
  cin>>t;
  cin.ignore();
  while(t--){
   string testcase;
    getline(cin,testcase);
    
    string solution = solve(testcase);
    cout<<solution<<endl;
  }
  return 0;
}