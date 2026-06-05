#include<iostream>
using namespace std;

int main()
{
    int a, b;
    cout<<"Enter values for a and b: ";
    cin>>a; cin>>b;

    if(a>b)
        cout<<"a is greater than b";

    if(a<b)
        cout<<"\na is lesser than b";

    if(a==b)
        cout<<"\na is equal to b";

    if(a!=b)
        cout<<"\na is not equal to b";

    if(a>=b)
        cout<<"\na is greater than or equal to b";

    if(a<=b)
        cout<<"\na is lesser than or equal to b";

    return 0;
}
