#include<iostream>
using namespace std;

int main()
{
    int result=0, n1, n2, ch;

    do{
        result=0;
        cout<<"\n**Menu**";
        cout<<"\n 1.Addition";
        cout<<"\n 2.Substraction";
        cout<<"\n 3.Multiplication";
        cout<<"\n 4.Division";
        cout<<"\n 5.Exit";
        cout<<"Enter your choice: ";
        cin>>ch;

        if((ch>=1) && (ch<=4))
        {
            cout<<"Enter 2 numbers: ";
            cin>>n1;
            cin>>n2;
        }
        switch(ch)
        {
            case 1: result= n1+n2;
                break;
            case 2: result= n1+n2;
                break;
            case 3: result= n1+n2;
                break;
            case 4: result= n1+n2;
                break;
            case 5: break;
            default:cout<<"\nInvalid choice";
        }
        cout<<"\n Result = "<<result;
        }while(ch!=5);

        return 0;
}
