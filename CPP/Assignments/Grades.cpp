#include<iostream>
using namespace std;

int main()
{
    int sub1,sub2,sub3,sub4,sub5;

    cout<<"Enter sub1 marks: ";
    cin>>sub1;

    cout<<"Enter sub2 marks: ";
    cin>>sub2;

    cout<<"Enter sub3 marks: ";
    cin>>sub3;

    cout<<"Enter sub4 marks: ";
    cin>>sub4;

    cout<<"Enter sub5 marks: ";
    cin>>sub5;

    int Total,per;
    char grade;
    Total=sub1+sub2+sub3+sub4;
    per=Total/4;

    if(per>=85)
        grade='A+';
    else if(per>=70)
        grade='A';
    else if(per>=60)
        grade='B+';
    else if(per>=50)
        grade='B';
    else if(per>=40)
        grade='C';
    else
        grade='Fail';

    cout<<"\nTotal= "<<Total;
    cout<<"\nPercentage= "<<per;
    cout<<"\nGrade= "<<grade;

    return 0;


}
