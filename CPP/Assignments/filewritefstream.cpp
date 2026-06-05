#include<iostream>
#include<fstream>

using namespace std;

int main()
{
    fstream file;

    file.open("xyz.txt", ios::out);

    file<< "Welcome to c++" <<endl;
    file<< 500;

    file.close();

    cout<<"File written successfully";

    return 0;
}

