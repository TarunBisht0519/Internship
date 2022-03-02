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
    public int salary()
    {
        sals=(int)(sales*(12/100.0f));
        int inc=(int)(base*(10/100.0f));
        sals=base+inc+sals;
        return sals;
    }
}
