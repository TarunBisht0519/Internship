package payrol;

public class Commission extends Department 
{
    String lname;
    int age;
    int sales;
    Commission(String fn,String lname,String department,int age,int sales)
    {
        fname=fn;
        this.lname=lname;
        dep=department;
        this.age=age;
        this.sales=sales;
    }
    public void salary() 
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        int sal=(int)(sales*(15/100.0f));
        System.out.println("SALARY :"+sal);
    }

}
