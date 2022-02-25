package payrol;

public abstract class Department 
{
    public int fixed=10000;
    int hourly=500;
    int base=12000;
    String dep;
    public String fname;
    public abstract void salary();
    public abstract String getinfo();

}
