package payrol;

public class Commission extends Department 
{
    int sales;
    Commission(String fn,String ln,String department,int aged,int sales)
    {
        fname=fn;
        lname=ln;
        dep=department;
        age=aged;
        this.sales=sales;
    }
    int sal;
    public void salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        sal=(int)(sales*(15/100.0f));
        System.out.println("SALARY :"+sal);
        pay=sal;
    }
    

}
