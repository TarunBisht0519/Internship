package payrol;
public class Hourly extends Employee 
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
    public int salary() 
    {
        
        if(hours>40)
        {
            sal=(hourly*15)/10;
        }
        else
        {
            sal=hourly*hours;
        }   
        
       return sal;
    }
    
    
}
