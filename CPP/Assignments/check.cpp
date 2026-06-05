#include<iostream>
#include<cstring>
using namespace std;

class Animal
{
protected:
    char name[20];
    int age;

public:
    Animal(char n[], int a)
    {
        strcpy(name,n);
        age=a;
    }

    virtual void talk() = 0;
};

class Cat : public Animal
{
public:
    Cat(char n[], int a):Animal(n,a){}

    void talk()
    {
        cout<<"Cat meows"<<endl;
    }

    bool operator==(Cat c)
    {
        if(strcmp(name,c.name)==0)
            return true;
        else
            return false;
    }
};

int main()
{
	Animal *animal = new Animal();  //This line should give compile time error "Cant create object of abstract class"

	//My Dog name is Boss & age is 15 months
	Animal *dogPtr = new Dog("Boss", 15);
	dogPtr->talk(); //Every animal has unique way of sound
	delete dogPtr;

	//My cat name is Puppy & she is 3 month old and it is-a Animal
	Cat c1("Puppy", 3);
	Cat c2("Sweety", 4);

	//Use strcmp function to to compare names of 2 Cat
	if(c1 == c2)
		cout<<"Both are same!"<<endl;
	else
		cout<<"Both are different!"<<endl;

	c1.talk();
}

