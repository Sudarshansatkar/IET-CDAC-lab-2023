//Declare function and call it by reference and note the observations

#include<iostream>
using namespace std;

void swap(int& , int& );
int main()
{
	int a,b;
	cout<<"enter 2 values aand b="<<endl;
	cin>>a>>b;
	cout<<"Values before swapping="<<a<<b<<endl;
	swap(a,b);  //pass by ref	

}

void swap(int& p, int& q)
{
	int temp = p;
	p=q;
	q=temp;
	cout<<"Values after swapping="<<p<<q<<endl;
}
