/*1 .Create a class Doctor with data members docId, fees[3],
float avgFees. Use Hospital as contained object.
Write no-args & parameterized constructors, accept(), display(),
calculateAvg().()function which calculates average*/

#include<iostream>
using namespace std;

class Hospital
{

    int hospId;

    public:
        Hospital()
        {
            cout<<"\nDefault constructor of hospital";
            hospId = 0;
        }

        void accept()
        {
            cout<<"\nEnter hospital ID: ";
            cin>>hospId;
        }
        void display()
        {
            cout<<"\nHospital ID: "<<hospId;
        }
};
class Doctor
{
    int docId, fees[3];
    float avgFees;
    Hospital h;

    public:
    Doctor()
    {
        cout<<"\nconstructor of doctor";
    }
    void accept()
    {
        cout<<"\nEnter Doctor ID: ";
        cin>>docId;

        for(int i; i<3; i++)
        {
            cout<<"\nEnter fees "<<i+1<<":";
            cin>>fees[i];
        }
        h.accept();
        calculateAvg();
    }

    void calculateAvg()
    {
        avgFees = (fees[0] + fees[1] + fees[2])/3;
    }
    void display()
    {
        cout<<"\nDoctor ID: "<<docId;
        cout<<"\nAverage Fees: "<<avgFees;
        h.display();
    }

};
int main()
{
    Doctor();
    Doctor d;
    d.accept();
    d.display();
}
