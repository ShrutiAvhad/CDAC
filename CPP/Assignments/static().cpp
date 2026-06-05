#include<iostream>
using namespace std;
class complex{
	int real,imag;
	public:
		complex()
		{
			real=imag=0;
		}
		complex(int i,int j)
		{
			real=i;
			imag=j;
		}
		int getreal()
		{
			return real;
		}
		int getimag()
		{
			return imag;
		}
		void display()
		{
			cout<<real<<"+"<<imag<<"i"<<endl;
		}

};
class Math{
	public:
    static float add(float a,float b)
    {
    	return a + b;
    }
	static int add(int a,int b)
	{
		return a+b;
	}
	static int mult(int a,int b)
	{
		return a*b;
	}
	static complex add(complex c1,complex c2)
	{
	complex temp(c1.getreal()+c2.getreal(),c1.getimag()+c2.getimag());
    return temp;
    }
   // friend istream& operator >>(istream& din, complex& m);
	friend ostream& operator <<(ostream& dout, complex& m);
};

ostream& operator <<(ostream& dout, complex& m)
{
	dout<<m.getreal()<<"+"<<m.getimag()<<"i"<<endl;
	return dout;
}


int main()
{
	complex c1(10,20),c2(2,2),c3;
	cout<<"Add two numbers"<<Math::add(3,4)<<endl;
	cout<<"Add two real numbers"<<Math::add(15.4f,13.2f)<<endl;
	cout<<"Multi two numbers"<<Math::mult(2,3)<<endl;
	cout<<"Add two complex numbers"<<endl;
	c3=Math::add(c1,c2);
	cout<<c3;
}
