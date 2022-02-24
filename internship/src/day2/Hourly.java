package day2;
public class Hourly extends Department 
{
    String lname;
    int age;
    int hours;
    Hourly(String fn,String lname,String department,int age,int hours)
    {
        fname=fn;
        this.lname=lname;
        dep=department;
        this.age=age;
        this.hours=hours;
    }
    public void salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        if(hours>40)
        {
            int sal=(hourly*15)/10;
            System.out.println("SALARY :"+sal*hours);
        }
        else
        {
            System.out.println("SALARY: "+hourly*hours);
        }   
    }
}
