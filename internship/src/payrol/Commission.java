package payrol;

public class Commission extends Employee 
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
    public int salary() 
    {
        sal=(int)(sales*(15/100.0f));
        return sal;
    }
    

}
