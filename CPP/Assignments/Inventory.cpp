#include<iostream>
using namespace std;

class inventory
{
protected:
    string name, category;
    int prodId;
    int quantity, minqty;
    float price;

public:
    inventory()
    {
        cout<<"\nDefault Constructor of inventory..";
    }

    void setData(string n, string cat, int id, int q, int mq, float p)
    {
        name = n;
        category = cat;
        prodId = id;
        quantity = q;
        minqty = mq;
        price = p;
    }

    // Getter
    int getQuantity()
    {
        return quantity;
    }

    // updateStock written AFTER getter
    void updateStock(int a)
    {
        quantity = quantity + a;
    }

    void display()
    {
        cout<<"\nName: "<<name;
        cout<<"\nQuantity: "<<quantity;
    }
};
class wholesaleItem : public inventory
{
    float discount;

    public:
    float calcost()
    {
        formula
    }

};


int main()
{
    inventory i1;

    i1.setData("Pen","Stationery",101,50,10,20);

    cout<<"\nQuantity before update: "<<i1.getQuantity();

    i1.updateStock(10);

    cout<<"\nQuantity after update: "<<i1.getQuantity();

    return 0;
}


