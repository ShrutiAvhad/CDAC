#include<iostream>
using namespace std;

//====================== Base Class ========================

class person
{
    protected :
        int person_id;
        string name;
        int age;

    public :

         //Default Constructor
         person()
         {
            cout<<"\n\nDefault constructor of person";

            person_id = 0;
            name = "NA";
            age = 0;
         }

         //Parameterized Constructor
         person(int id, string nm, int a)
         {
             cout<<"\n\nParameterized Constructor of person";

             person_id = id;
             name = nm;
             age = a;
         }

         //Virtual Destructor
         virtual ~person()
         {
            cout<<"\n\nDestructor of person";
         }

         //Virtual Display
         virtual void display()
         {
            cout<<"\n\nPerson id = "<<person_id;
            cout<<"\n\nName = "<<name;
            cout<<"\n\nAge = "<<age;
         }

         //pure virtual functions
         virtual void talk() = 0;

         virtual void display_identity() = 0;
};

//========================== Doctor Class =============================

class doctor : public person
{
    string specialization;
    float opd_charges;

    public :

        //Default Constructor
        doctor()
        {
            cout<<"\n\nDefault Constructor of doctor";

            specialization = "NA";
            opd_charges = 0.0f;
        }

        //Parameterized Constructor
        doctor(int id, string nm, int a, string sp, float opdch) : person(id, nm, a)
        {
            cout<<"\n\nParameterized Constructor of Doctor";

            specialization = sp;
            opd_charges = opdch;
        }

        //Destructor
        ~doctor()
        {
            cout<<"\n\nDestructor of doctor";
        }

        //Display of doctor
        void display()
        {
            person :: display();

            cout<<"\n\nSpecialization = "<<specialization;
            cout<<"\n\nOPD charges = "<<opd_charges;
        }

        //Pure virtual functions
        void talk()
        {
            cout<<"\n\nDoctor talks about "<<specialization;
        }

        void display_identity()
        {
            cout<<"\n\n I am doctor";
        }
};

//========================== Teacher Class ========================

class teacher : public person
{
    string subject;
    float rate_per_hr;

    public :

        //Default Constructor
        teacher()
        {
            cout<<"\n\nDefault Constructor of teacher";

            subject = "NA";
            rate_per_hr = 0 ;
        }

        //Parameterized Constructor
        teacher(int id, string nm, int a, string sub, float r) : person(id, nm, a)
        {
            cout<<"\n\n Parameterized Constructor of teacher";

            subject = sub;
            rate_per_hr = r ;
        }

        //Destructor
        ~teacher()
        {
            cout<<"\n\nDestructor of teacher";
        }

        //Display of teacher
        void display()
        {
            person :: display();
            cout<<"\n\nSubject = "<<subject;
            cout<<"\n\nRate per hr = "<<rate_per_hr;
        }

        //Pure virtual functions
        void talk()
        {
            cout<<"\n\nTeacher teaches "<<subject;
        }

        void display_identity()
        {
            cout<<"\n\nI am a teacher ";
        }
};

//============================ Student Class ==========================

class Student : public person
{
    string course_name;

    public :

    //Default Constructor
    Student()
    {
        cout<<"\n\nDefault Constructor of student";
        course_name = "NA";
    }

    //Parameterized Constructor
    Student(int id, string nm, int a, string c) : person(id, nm, a)
    {
        cout<<"\n\nParameterized Constructor of Student";
        course_name = c;
    }

    //Destructor
    ~Student()
    {
        cout<<"\n\nDestructor of student";
    }

    //Display
    void display()
    {
        person :: display();
        cout<<"\n\nCourse name = "<<course_name;
    }

    //Pure virtual function
    void talk()
    {
        cout<<"\n\nStudent studying "<<course_name;
    }

    void display_identity()
    {
        cout<<"\n\nI am Student";
    }
};

//============================ Main ===========================

int main()
{
    cout<<"\n\n========== Single Object ===========";

    person *p = new Student(1, "Shruti", 24, "PGCP-AC");

    p->display();
    p->talk();
    p->display_identity();

    cout<<"\n\n============= Deleting Single Object ============";

    delete p;


    cout<<"\n\n========== Array of objects ===========";

    person *p1[3];

    p1[0] = new doctor(2, "Shru", 23, "Cardiologist", 1200);
    p1[1] = new Student(3, "Adi", 24, "CDAC");
    p1[2] = new teacher(4, "Amaan", 22, "Science", 500);

    for(int i = 0; i < 3; i++)
    {
        cout<<"\n\n---------------\n";

        p1[i]->display();
        p1[i]->talk();
        p1[i]->display_identity();
    }

    cout<<"\n\n====== Destructors ========";

    for(int i = 0; i < 3 ; i++)
    {
        delete p1[i];
    }

    return 0;
}
