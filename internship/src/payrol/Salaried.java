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
    public int salary() 
    {
        return fixed;
    }
    
}
