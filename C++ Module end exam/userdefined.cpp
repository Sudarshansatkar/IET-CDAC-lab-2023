#include<iostream>
using namespace std;

#include<string.h>

class String
{
	int len;
	char *ptr;
	
	public :
				String()
				{
					cout<<"Default constructor is called:"<<endl;
				}
	
				String( char ch, int len)
				{
					int i=0;
					this->len=len;
					ptr=new char[this->len+1];
					
					
					cout<<"Parametrized constructor is called:"<<endl;
					for(i=0;i<len;i++)
					{
						cout<<(ptr[i]=ch);
					}
					ptr[i]='\0';
					cout<<endl;
				}
				
				
				String(char* sptr)
				{
					len=strlen(sptr);
					ptr=new char[len+1];
					strcpy(ptr,sptr);
				}
				
				acceptstring()
				{
					int len;
					cout<<"Enter the length of string:";
					cin>>len;
					this->len=len;
					
					char ptr1[len+1];
					cout<<"Enter the string:";
					cin>>ptr1;
					
					ptr=new char[this->len+1];
					
					strcpy(this->ptr,ptr1);			
				}
				
				displaystring()
				{
					cout<<"Length of the string is:"<<this->len<<endl;
					cout<<"String is:"<<this->ptr<<endl;
				}
				
				
				String(String &s3)
				{
					this->len=s3.len;
					ptr=new char[this->len+1];
					
					strcpy(this->ptr,s3.ptr);
				}
	
				~String()
				{
					cout<<"Destructor is called"<<endl;
					if(ptr)
					delete[]ptr;
					ptr=NULL;
					
				}
	
	
};


int main()
{
	String s1;
	
	s1.acceptstring();
	s1.displaystring();
	
	String s2('B',5);
	
	String s3("Violet");
	
	cout<<"Parametrized constructor is called:"<<endl;
	s3.displaystring();
	
	{
		
	String s4(s3);
	
	cout<<"copy constructor is called:"<<endl;
	s4.displaystring();
	}
	
	s3.displaystring();
	
	
}
