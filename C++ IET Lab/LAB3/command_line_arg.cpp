/*Implement a program which accepts command line arguments from main function.*/

#include <iostream>
using namespace std;

int main(int argc, char** argv)
{
    cout << "You have entered " << argc << " arguments:"
         << "\n";
 
    for (int i = 0; i < argc; ++i)
    
        cout <<"argv = " << argv[i] << "\n";
        cout <<"argc = " << argc << "\n";
 
    return 0;
}
