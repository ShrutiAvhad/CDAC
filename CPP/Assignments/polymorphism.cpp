#include<iostream>
using namespace std;

class Base {
	protected:
	int i;
	public:
		Base()
		{
			cout<<"\n Default Const of Base ";
			i = 0;
		}
		Base(int n)
		{
			cout<<"\n Pamater Const of Base ";
			i = n;
		}
		virtual ~Base()
		{
			cout<<"\n Destrtuctor of Base";
		}
		virtual void display()
		{
			cout<<"\n i = "<<i;
		}

};

class Derived1 : public Base{
	protected:
	 int j;
	public:
	Derived1()
	{
		cout<<"\n Default Constr of Derived1";
		j = 0;
	}
	Derived1(int n,int m): Base(n)
	{
	//	i = n;
		cout<<"\n Parameter Constr of Derived1";
		j = m;
	}
	~Derived1()
	{
		cout<<"\n Destructor of Derived1";
	}
	void display()
	{
		cout<<"\n i= "<<i;
	   // Base::display();
		cout<<"\n j= "<<j;
	}
	void fun()
	{
		cout<<"\n fun is called..";
	}
};


class Derived2 : public Derived1 {
	int k;
	public:
		Derived2() {
		k = 0;
		cout<<"\n Default Const of Derived2";
		}
		Derived2(int n, int m, int p) :Derived1(n,m)
		{
		k = p;
		cout<<"\n parameter Const of Derived2";
		}
		void display()
		{
			cout<<"\n i = "<<i<<" j = "<<j<<" k = "<<k;
		}
		~Derived2()
		{
			cout<<"\n Destrcutor of Derived2";
		}

};
int main()
{
    Derived2 obj;
    Base *ptr = &obj;
    ptr->display();

    ptr = new Derived1(10,20);
    ptr->display();

    delete ptr;

    return 0;

}
