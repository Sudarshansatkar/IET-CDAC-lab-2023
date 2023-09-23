#include<iostream>
using namespace std;

class Complex
{
	int real,img;
	
	public:
		
		Complex();
		Complex(int ,int);
		void display();
		
		Complex operator-(Complex &);
		Complex operator+(Complex &);
		Complex operator-();	
};


Complex::Complex()
{
	real=0;
	img=0;
}

Complex::Complex(int real,int img)
{
	this->real=real;
	this->img=img;
}

Complex Complex::operator+(Complex &c)
{
	
	Complex temp;
	temp.real=this->real+c.real;
	temp.img=this->img+c.img;
	return temp;
}

Complex Complex:: operator-(Complex &c)
{
	Complex temp;
	temp.real=this->real-c.real;
	temp.img=this->img-c.img;
	return temp;
}

Complex Complex::operator-()
{
	Complex temp;
	temp.real=-this->real;
	temp.img=-this->img;
	return temp;
}

void Complex::display()
{
	if(img>0)
	{
	
	cout<<"complex no is= "<<real<<"+"<<img<<"i"<<endl;
	}
	else
	cout<<"complex no is= "<<real<<img<<"i"<<endl;
	
}


int main()
{
	Complex c1(5,7);
	Complex c2(3,6);
	
	Complex c3;
	c3=c1+c2;
	c3.display();
	
	
	Complex c4;
	c4=c1-c2;
	c4.display();
	
	Complex c5(5,9);
	Complex c6=-c5;
	c6.display();
	
}



