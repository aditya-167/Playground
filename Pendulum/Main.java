#include<bits/stdc++.h>
using namespace std;
int main()
{
  	int n,i,j,temp;
  	cin>>n;
  	int a[n],b[n];
  	for(i=0;i<n;i++)
  		cin>>a[i];
	sort(a,a+n);
   	int left=0,right=n-1,flag=1;
   	for(i=n-1;i>=0;i--)
   	{
   		if(flag==1)
   		{
   			b[right--]=a[i];
			flag=0;	
		}
		else
		{
			b[left++]=a[i];
			flag=1;
		}
	}
	for(i=0;i<n;i++)
		cout<<b[i]<<" ";
	return 0;
}