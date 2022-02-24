package day2;
public class Salaried extends Department
{
    String lname;
    int age;
    Salaried(String fn,String lname,String department,int age)
    {
        fname=fn;
        this.lname=lname;
        dep=department;
        this.age=age;
    }
    public void salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        System.out.println("THE SALARY IS "+fixed);
    }
}
