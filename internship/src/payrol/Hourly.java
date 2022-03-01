package payrol;
public class Hourly extends Department 
{
    String lname;
    int age;
    int hours;
    Hourly(String fn,String lname,String department,int age,int hours)
    {
        fname=fn;
        this.lname=lname;
        dep=department;
        this.age=age;
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
        }
        else
        {
            sal=hourly*hours;
            System.out.println("SALARY OF EMPLOYEE IS "+sal);
        }   
       
    }
    public String getinfo()
    {
        return new StringBuffer("(.)First Name: ").append(fname).append("\n")
                .append(" Last Name : ").append(this.lname).append("\n").append(" Age : ").append(this.age).append("\n").append(" DEPARTMENT TYPE :")
                .append(dep).append("\n").append(" SALARY OF EMPLOYEE :").append(sal).append("\n").toString();
    }
}
