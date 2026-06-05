#include<iostream>
using namespace std;

int main()
{
    int year;
    cout<<"Enter year: ";
    cin>>year;

    if(year%100!=0)
    {
        if(year%4==0)
            cout<<"\nLeap year";
        else
            cout<<"\nNot a leap year";
    }
    else
    {
        if(year%400==0)
            cout<<"\nLeap year";
        else
            cout<<"\nNot a leap year";
    }
    return 0;
}
