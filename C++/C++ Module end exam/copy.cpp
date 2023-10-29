#include<iostream>
using namespace std;

void ustrcpy(char*,char*);

int main()
{
	char *str1=new char[10];
	char *str2=new char[10];
	
	cout<<"Enter the 1st string a:";
	cin>>str1;
	cout<<"Enter the 2nd string b:";
	cin>>str2;
	
	ustrcpy(str1,str2);
	cout<<"The copies string from b to a is:"<<str1;
}

void ustrcpy(char*p , char*q)
{
	while(*p!='\0')
	{
		*p=*q;
		p++;
		q++;
	}
	
}
