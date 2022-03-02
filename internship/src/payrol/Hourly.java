package payrol;
public class Hourly extends Department 
{
    
    int hours;
    Hourly(String fn,String ln,String department,int aged,int hours)
    {
        fname=fn;
        lname=ln;
        dep=department;
        age=aged;
        this.hours=hours;
    }
    int sal;
    public void  salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        if(hours>40)
        {
            sal=(hourly*15)/10;
            System.out.println("SALARY OF EMPLOYEE IS "+sal);
            pay=sal;
        }
        else
        {
            sal=hourly*hours;
            System.out.println("SALARY OF EMPLOYEE IS "+sal);
            pay=sal;
        }   
       
    }
    
}
