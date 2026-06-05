#include<iostream>
using namespace std;

int main()
{

    char str[10];
    cin.read(str,10);

    int count_x = 0;
    int count_o = 0;

    for(int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == 'x') count_x ++;
        if(str[i] == 'o') count_o ++;
    }

    cout<<"\nCount of x = "<<count_x<<"\nCount of o = "<<count_o<<endl;
}
