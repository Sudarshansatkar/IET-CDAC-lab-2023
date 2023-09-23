//Implement all C++ operators
//C++ Arithmetic Operators

#include <iostream>
using namespace std;

int main() 
{
    int a, b;
    a = 7;
    b = 2;
    
    cout << "a + b = " << (a + b) << endl;
    cout << "a - b = " << (a - b) << endl;
    cout << "a * b = " << (a * b) << endl;
    cout << "a / b = " << (a / b) << endl;
    cout << "a % b = " << (a % b) << endl;
    
    // Assignement operator
    
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    cout << "\nAfter a += b;" << endl;

    // assigning the sum of a and b to a
    a += b;  // a = a +b
    cout << "a = " << a << endl;

	return 0;
	
	
	
}
