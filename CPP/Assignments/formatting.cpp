#include<iostream>
#include<iomanip>

using namespace std;

int main()
{
    char line[20];

    cout<<"Enter line : ";
    cin.getline(line, 20);

    cout<<line<<endl;

    char c;

    cout<<"Enter char : ";
    cin.get(c);

    cout<<c<<endl;

    cout<<setw(7)
        <<setfill('*')
        <<"Hello"
        <<endl;

    return 0;
}
