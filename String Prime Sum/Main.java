#include <bits/stdc++.h>
using namespace std;
int ATOI(string);
int primesum(int);
int main() 
{ 
	string s;
	getline(cin,s);
	int val = ATOI(s);
    int result = primesum(val);
    cout<<result;
    return 0; 
} 
bool isNumericChar(char x) 
{ 
    return (x >= '0' && x <= '9') ? true : false; 
} 
int ATOI(string str) 
{ 
    if (str[0] == '\0') 
        return 0;  
    int res = 0; 
    int sign = 1; 
    int i = 0; 
    if (str[0] == '-') 
	{ 
        sign = -1; 
        i++; 
    } 
    for (; str[i] != '\0'; ++i) 
	{ 
        if (isNumericChar(str[i]) == false) 
            return 0; 
        res = res * 10 + str[i] - '0'; 
    } 
    return sign * res; 
} 
int isprime(int n)
{
	int i,flag=1;
	for(i=2;i<=sqrt(n);i++)
	{
		if(n%i==0)
		{
			flag=0;
			break;
		}
	}
	return flag;
}
int primesum(int val)
{
	if(val<0)
	{
		return val*11;
	}
	int sum=0;
	for(int i=2;i<val;i++)
	{
		if(isprime(i))
		{
			sum+=i;
		}
	}
	return sum;
}