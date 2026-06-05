#include<iostream>
using namespace std;


class Emp{
    private:
        int id;
        String name;
        int sal;
    public:
    Emp(){
        id =0;
        name = "xxx";
        sal = 0;
    }
    emp(int id , String name,int sal){
        this.id=id;
        this.name = name;
        this.sal = sal;
    }
virtual ~Emp(){}

virtual int cal_sal()=0;
    
};


class SDE : public Emp{
private:
    String lang;

public:

SDE(){
    lang = "XXX";
}

SDE(int id , String name,int sal,String Lang):Emp(id,name,sal){

    this.lang = Lang;
}
~SDE(){}




};