package payrol;
public class Salaried extends Department
{
    
    Salaried(String fn,String ln,String department,int aged)
    {
        fname=fn;
        lname=ln;
        dep=department;
        age=aged;
    }
    public void salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        System.out.println("THE SALARY IS "+fixed);
        pay=fixed;
    }
    
}
