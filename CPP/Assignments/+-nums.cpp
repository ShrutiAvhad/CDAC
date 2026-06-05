#include<iostream>
using namespace std;

int main()
{
    int i;
    cout<<"Enter a number: ";
    cin>>i;

    if(i>0)
        cout<<"\nNumber is positive..";
    else if(i==0)
        cout<<"\nNumber is neither positive nor negative..Its zero";
    else
        cout<<"\nNumber is negative..";

    return 0;
}
