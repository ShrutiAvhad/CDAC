#include<iostream>
using namespace std;

int main()
{
    char choice;
    cout<<"\nEnter your choice: ";
    cin>>choice;

    switch(choice)
    {
        case 'a':
            cout<<"Alphabet is vowel\n";//cout<<"First\n";
            break;
        case 'e':
            cout<<"Alphabet is vowel\n";//cout<<"Second\n";
            break;
        case 'i':
            cout<<"Alphabet is vowel\n";//cout<<"Third\n";
            break;
        case 'o':
            cout<<"Alphabet is vowel\n";
            break;
        case 'u':
            cout<<"Alphabet is vowel\n";
            break;
        default:
            cout<<"Alphabet is a consonant\n";
    }
    return 0;
}
