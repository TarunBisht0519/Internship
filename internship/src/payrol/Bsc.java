package payrol;

public class Bsc extends Department
{
    int sales;
    Bsc(String fn,String ln,String department,int aged,int sales)
    {
        fname=fn;
        lname=ln;
        dep=department;
        age=aged;
        this.sales=sales;
    }
    int sals;
    public void salary()
    {
        System.out.println("FIRST NAME OF EMPLOYEE "+fname);
        System.out.println("LAST NAME OF EMPLOYEE "+lname);
        System.out.println("AGE OF EMPLOYEE "+age);
        System.out.println("DEPARTMENT TYPE OF EMPLOYEE :"+dep);
        sals=(int)(sales*(12/100.0f));
        int inc=(int)(base*(10/100.0f));
        sals=base+inc+sals;
        System.out.println("COMPANY DECIDED TO GIVE INCREMENT OF 10% OF YOUR CURRENT BASE SALARY");
        System.out.println("NEW SALARY IS "+sals);
        pay=sals;
    }
}
