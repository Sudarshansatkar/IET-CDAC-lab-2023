#include<iostream>
using namespace std;

class Complex
{
	int real, img;
	public:
		Complex(int,int);
		void display();
		
		Complex operator--();
		Complex operator--(int);
		
};

Complex::Complex(int real, int img)
{
	this->real=real;
	this->img=img;
}

Complex Complex::operator--()
{
	--this->real=real;
	--this->img=img;
	return (*this);
}

Complex Complex::operator--(int)
{
	Complex temp=(*this);
	--this->real=real;
	--this->img=img;
	return temp;
}

void Complex::display()
{
	if(img>0)
	{
		cout<<"the complex no. is= "<<real<<"+"<<img<<"i"<<endl;
	}
	else
		cout<<"the complex no. is= "<<real<<img<<"i"<<endl;
}

int main()
{
	/*Complex c1(5,6);      //pre decrement
	Complex c2=--c1;
	c1.display();
	c2.display();*/
	
	Complex c1(5,6);     //post decrement
	Complex c2=c1--;
	c1.display();
	c2.display();
}
