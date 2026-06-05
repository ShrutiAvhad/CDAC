#include<iostream>
using namespace std;

class shape
{
    protected:
    int side;
    public:

    shape()
    {
        cout<<"\ndefault constructor of shape";
    }
    shape(int s)
    {
        cout<<"\nparameterised constructor of shape";
        side=s;
    }
    virtual~shape()
    {
        cout<<"\nDestructor of shape";
    }
    virtual void area()
    {
        cout<<"\nArea function of shape";
    }
};
class square: public shape
{
    protected:
    //int side;
    public:

    square()
    {
        cout<<"\nconstructor of square";
        side=0;
    }
    square(int a):shape(a)
    {
        cout<<"\nparameterised constructor of square";
        side=a;

    }
    ~square()
    {
        cout<<"\ndestructor of square";
    }
    void area()
    {
        cout<<"\nArea of square= "<<side*side;
    }
};
class circle: public shape
{
    protected:
    float radius;
    public:

    circle()
    {
        cout<<"\ndefault constructor of circle";
    }
    circle(float r)
    {
        cout<<"\nparameterised constructor of circle";
        radius=r;

    }
    ~circle()
    {
        cout<<"\ndestructor of circle";
    }
    void area()
    {
        cout<<"\nArea of circle= "<<3.14*radius*radius;
    }

};

int main()
{
    shape *a;//ptr to base class

    a=new square(4);//we allocate new memory obj in heap and addr of a ptr is stored in a
    a->area();//ptr to virtual area/at runtime
    delete a;//destructor of square and shape


    a=new circle(3);
    a->area();
    delete a;

    return 0;

}
