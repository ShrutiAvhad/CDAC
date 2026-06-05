#include<iostream>
using namespace std;
static int global_stat=10;
class ABC{
	static int i;
	public:

		ABC()
		{
		i=i+1;
		}
		ABC(int j)
		{
			i=j;
		}
		static void display()
		{
			global_stat=20;
			cout<<"i="<<i<<endl;
		}
		~ABC()
		{
			i=i-1;
		}
};

int ABC::i;

int main()
{
	ABC obj1,obj2,obj3;
	global_stat=120;
	ABC::display();
	{
		ABC obj4(15),obj5;
		ABC::display();
	}
	ABC::display();
	cout<<"global_stat ="<<global_stat;
}

