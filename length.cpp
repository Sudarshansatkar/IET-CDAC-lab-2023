#include<iostream>
using namespace std;


int ustrlen(char*);

int main()
{
	
	char *str1=new char[20];
	
	cout<<"Enter the String:";
	cin>>str1;
	
	int x=ustrlen(str1);
	cout<<"String Length is:"<<x;
	
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
