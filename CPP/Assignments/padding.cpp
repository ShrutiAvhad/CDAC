#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
    int n, square;
    cout<<"Enter number: ";
    cin>>n;
    square=n*n;


    cout<<setw(10)<<"number"<<setw(10)<<"Square"<<endl;
    cout<<setw(10)<<n<<setw(10)<<square;

    return 0;
}
