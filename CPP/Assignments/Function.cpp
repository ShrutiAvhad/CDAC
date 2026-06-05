#include<iostream>
using namespace std;

void display_hello();
int main()
{
    cout<<"\nWelcome";
    display_hello();
    cout<<"\n The end";
    return 0;
}

void display_hello()
{
    cout<<"\nHello";
    cout<<"\nWorld";
}
