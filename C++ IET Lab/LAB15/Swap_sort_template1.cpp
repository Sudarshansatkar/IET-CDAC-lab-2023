//Sort and swap in template

#include<iostream>
using namespace std;

template<class T>
T sort(T n)
{
	T i,j,a[n];
	cout<<"enter the elements to be sorted=";
	for(i=0;i<n;i++)
	{
	  cin>>a[i];	
	}	
	

	for (i=0;i<n;i++)
	{
		for (j=1;j<=n-i-1;j++)
		{
			
			if(a[j]<a[j-1])
			{
				swap(a[j],a[j-1]);
			}
				
		}	
	}
	
	cout<<"sorted elements are="<<endl;
	for(i=0;i<n;i++)
	{
	  cout<<a[i];
	}	
	
}

/*template<class Y>
Y swap()
{
	
}*/

int main()
{
	int n;
	cout<<"enter no. of elements to be sorted= ";
	cin>>n;
	
	sort(n);

	
	
}
