#include<iostream>
using namespace std;

int main()
{
    int a,b,c,big;
    cout<<"Enter a, b, c : ";
    cin>>a;cin>>b;cin>>c;

    if(a>b)
    {
        if(a>c)
            big=a;
        else
            big=c;
    }
    else
    {
        if(b>c)
            big=b;
        else
            big=c;
    }

    cout<<"BIGGEST NO IS : "<<big;
    return 0;
}
