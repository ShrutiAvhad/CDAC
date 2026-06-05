#include<iostream>
using namespace std;

class media
{
    protected:
    string title;
    float price;

    public:
        media(string t, float p)
        {
            title = t;
            price = p;
        }
        virtual void display()
        {
            cout<<"\nTitle: "<<title;
            cout<<"\nPrice: "<<price;
        }
};
class Book: public media
{
    int pages;

    public:
        Book(string t, float p, int pg) : media(t,p)
        {
            pages = pg;
        }
        void display()
        {

        }

};
