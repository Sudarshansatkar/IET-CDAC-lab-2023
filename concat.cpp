#include<iostream>
using namespace std;

void ustrconcat(char*,char*);
//concat string
int main()
{
	char *str1=new char[20];
	char *str2=new char[20];
	
	cout<<"Enter the 1st string a:";
	cin>>str1;
	cout<<"Enter the 2nd string b:";
	cin>>str2;
	
	ustrconcat(str1,str2);
	cout<<"Concated string is:"<<str1;
	
	
}

void ustrconcat(char* p, char* q)
{
	while(*p!='\0')
	{
		p++;
	}
	
	while(*q!='\0')
	{
		*p=*q;
		p++;
		q++;
	}
	
	*p='\0';
	
}
