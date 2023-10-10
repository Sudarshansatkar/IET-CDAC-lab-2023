#include<iostream>
using namespace std;

int ustrlen(char*);
int main()
{
	char* name[5]={"raj","rohan","ravi","mani","shree"};
	
	for ( int i=0;i<5;i++)
	{
		int x=ustrlen(*(name+i));
		
		for( int j=0;j<x;j++)
		{
			cout<<(*(*(name+i)+j));
		}
		cout<<endl;
	}	
	
}

int ustrlen(char* p)
{
	int len=0;
	while(*p!='\0')
	{
		p++;
		len++;
		
	}
	return len;

}


