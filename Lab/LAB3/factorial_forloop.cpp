/*Factorial number of given number*/

#include<iostream>
using namespace std;

int main()
{
	int i, num, fact;
	cout<<"enter the number = "<<endl;
	cin>>num;
	
	for(i=1; i<=num; i++)
	{
		fact= fact*i;
	}
	cout<<"Factorial of given number is = "<<fact<<endl;
}

